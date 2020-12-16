package com.miguelcaetano.hyperskill.basic_syntax.celsius_to_fahrenheit;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(fahrenheit);
    }
}
