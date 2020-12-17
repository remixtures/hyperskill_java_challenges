package com.miguelcaetano.hyperskill.regular_expressions.extracting_big_numbers_from_a_text;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringWithNumbers = scanner.nextLine();

        Pattern bigNumberPattern = Pattern.compile("\\d{10,}");
        Matcher matcher = bigNumberPattern.matcher(stringWithNumbers);
        while (matcher.find()) {
            int length = matcher.end() - matcher.start();
            System.out.println(matcher.group() + ":" + length);
        }
    }
}
