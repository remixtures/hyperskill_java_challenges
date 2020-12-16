package com.miguelcaetano.hyperskill.basic_syntax.tens_digit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int tens = (number % 100) / 10;
        System.out.println(tens);
    }
}