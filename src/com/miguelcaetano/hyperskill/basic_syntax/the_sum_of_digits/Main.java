package com.miguelcaetano.hyperskill.basic_syntax.the_sum_of_digits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int sumOfDigits = hundreds + tens + ones;
        System.out.println(sumOfDigits);
    }
}