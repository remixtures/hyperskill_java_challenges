package com.miguelcaetano.hyperskill.basic_syntax.calculating_factorials;

import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}