package com.miguelcaetano.hyperskill.regular_expressions.in_the_middle_of_a_word;

import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();
        Pattern patternOne = Pattern.compile("\\B" + part + "\\B", Pattern.CASE_INSENSITIVE);
        Matcher matcherOne = patternOne.matcher(line);
        if (matcherOne.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
