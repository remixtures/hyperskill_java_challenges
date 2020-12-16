package com.miguelcaetano.hyperskill.basic_syntax.evaluate_an_expression;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double result = a * 10.5 + b * 4.4 + (c + d) / 2.2;
        System.out.println(result);
    }
}