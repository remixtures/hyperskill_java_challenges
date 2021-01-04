package com.miguelcaetano.hyperskill.basic_syntax.area_of_a_circle;

import java.util.Scanner;

/* FLOATING-POINT TYPES:


 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
    }
}