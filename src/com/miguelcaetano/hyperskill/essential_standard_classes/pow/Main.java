package com.miguelcaetano.hyperskill.essential_standard_classes.pow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double result = Math.pow(a, b);
        System.out.println(result);
    }
}