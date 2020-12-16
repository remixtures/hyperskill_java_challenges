package com.miguelcaetano.hyperskill.basic_syntax.liquid_pressure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        double gravity = 9.8;
        double liquidPressure = density * gravity * height;
        System.out.println(liquidPressure);
    }
}
