package com.miguelcaetano.hyperskill.basic_syntax.first_digit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOfDigits = number / 10;
        System.out.println(numberOfDigits);
    }
}
