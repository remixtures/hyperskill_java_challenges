package com.miguelcaetano.hyperskill.essential_standard_classes.herons_formula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double p = (double) (a + b + c) / 2;
        double number = p * (p - a) * (p - b) * (p - c);
        double result = Math.sqrt(number);
        System.out.println(result);
        // put your code here
    }
}