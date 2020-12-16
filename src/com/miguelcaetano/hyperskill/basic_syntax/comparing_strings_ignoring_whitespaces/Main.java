package com.miguelcaetano.hyperskill.basic_syntax.comparing_strings_ignoring_whitespaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        String firstTrimmed = first.replaceAll(" ", "").trim();
        String secondTrimmed = second.replaceAll(" ", "").trim();
        if (secondTrimmed.equals(firstTrimmed)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}