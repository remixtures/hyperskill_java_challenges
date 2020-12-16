package com.miguelcaetano.hyperskill.basic_syntax.concat_all_strings_without_digits;

import java.util.Scanner;
import java.util.stream.Stream;

class ConcatenateStringsProblem {

    public static String concatStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder sb  = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }

        for (int temp = 0; temp < sb.length(); temp++) {
            if (Character.isDigit(sb.charAt(temp))) {
                return sb.toString().replaceAll("[0-9]", "");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] strings = Stream
                .of(text.split("\\s+"))
                .toArray(String[]::new);
        if (text.length() > 2) {
            String result = concatStringsWithoutDigits(strings);
            System.out.println(result);
        } else {
            System.out.println(text);
        }
    }
}
