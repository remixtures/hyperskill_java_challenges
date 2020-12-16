package com.miguelcaetano.hyperskill.basic_syntax.the_roots_of_an_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for (int i = 0; i <= 1000; i++) {
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                System.out.println(i);
            }
        }
    }
}
