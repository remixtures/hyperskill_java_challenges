package com.miguelcaetano.hyperskill.regular_expressions.extracting_words_from_a_text;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern programmingPattern = Pattern.compile("\\bprogram[a-z]*\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = programmingPattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
