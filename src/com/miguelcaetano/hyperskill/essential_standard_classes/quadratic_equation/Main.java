package com.miguelcaetano.hyperskill.essential_standard_classes.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double answer1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double answer2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        if (answer1 > answer2) {
            System.out.println(answer2 + " " + answer1);
        } else {
            System.out.println(answer1 + " " + answer2);
        }
    }
}
