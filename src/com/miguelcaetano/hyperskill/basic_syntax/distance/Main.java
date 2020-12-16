package com.miguelcaetano.hyperskill.basic_syntax.distance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        double time = scanner.nextDouble();
        double speed = distance / time;
        System.out.println(speed);
    }
}