package com.miguelcaetano.hyperskill.basic_syntax.reversing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversed = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;

        }
        System.out.println(reversed);
    }
}
