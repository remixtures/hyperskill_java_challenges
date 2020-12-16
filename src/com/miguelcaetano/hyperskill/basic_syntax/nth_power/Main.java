package com.miguelcaetano.hyperskill.basic_syntax.nth_power;

import java.util.Scanner;

public class Main {

    public static double pow(double a, long n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            if (n == 2) {
                return a * a;
            }
            return pow(pow(a, n / 2), 2);
        } else {
            return a * pow(a, n - 1);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double a = Double.parseDouble(scanner.nextLine());
        final int n = Integer.parseInt(scanner.nextLine());
        System.out.println(pow(a, n));
    }
}