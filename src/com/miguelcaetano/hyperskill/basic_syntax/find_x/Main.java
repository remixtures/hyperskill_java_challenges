package com.miguelcaetano.hyperskill.basic_syntax.find_x;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.valueOf(scanner.next());
        double b = Double.valueOf(scanner.next());
        double c = Double.valueOf(scanner.next());
        double x = (c - b) / a;
        System.out.println(x);
    }
}
