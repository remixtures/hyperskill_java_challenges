package com.miguelcaetano.hyperskill.basic_syntax.floor_space_of_the_room;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shapes = scanner.nextLine();
        double a;
        double b;

        switch (shapes) {
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                double areaRectangle = a * b;
                System.out.println(areaRectangle);
                break;
            case "circle":
                double r = scanner.nextDouble();
                double areaCircle = r * r * 3.14;
                System.out.println(areaCircle);
                break;
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                double areaTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(areaTriangle);
                break;
            default:
                System.out.println("Unknown form");
                break;
        }
    }
}
