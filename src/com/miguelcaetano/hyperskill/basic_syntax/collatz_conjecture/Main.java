package com.miguelcaetano.hyperskill.basic_syntax.collatz_conjecture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 1) {
            System.out.print(n + " ");
        } else {
            System.out.print(n + " ");
            while (n != 2) {
                if (n % 2 == 0) {
                    n = n / 2;
                    System.out.print(n + " ");
                }
                if (n % 2 != 0) {
                    n = n * 3 + 1;
                    System.out.print(n + " ");
                }
            }
            System.out.println(n / 2);
        }
    }
}
