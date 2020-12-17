package com.miguelcaetano.hyperskill.regular_expressions.find_all_passwords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regExMatcher = "((?<=password:?)\\s*\\w+)";
        Pattern passwordPattern = Pattern.compile(regExMatcher, Pattern.CASE_INSENSITIVE);
        Matcher matcher = passwordPattern.matcher(text);
        boolean flag = false;
        while (matcher.find()) {
            System.out.println(matcher.group(1).trim());
            flag = true;
        }
        if (!flag) {
            System.out.println("No passwords found.");
        }
    }
}
