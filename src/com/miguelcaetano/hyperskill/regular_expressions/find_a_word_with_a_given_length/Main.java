package com.miguelcaetano.hyperskill.regular_expressions.find_a_word_with_a_given_length;

import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        String regExMatcher = "\\b[A-Za-z]{" + size + "}\\b";
        Pattern pattern = Pattern.compile(regExMatcher);
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}