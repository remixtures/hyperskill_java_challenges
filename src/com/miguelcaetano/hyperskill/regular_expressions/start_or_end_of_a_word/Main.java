package com.miguelcaetano.hyperskill.regular_expressions.start_or_end_of_a_word;

import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();
        String regExMatcherOne = "\\b" + part;
        String regExMatcherTwo = part + "\\b";
        Pattern patternOne = Pattern.compile(regExMatcherOne, Pattern.CASE_INSENSITIVE);
        Pattern patternTwo = Pattern.compile(regExMatcherTwo, Pattern.CASE_INSENSITIVE);
        Matcher matcherOne = patternOne.matcher(line);
        Matcher matcherTwo = patternTwo.matcher(line);
        if (matcherOne.find() || matcherTwo.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
