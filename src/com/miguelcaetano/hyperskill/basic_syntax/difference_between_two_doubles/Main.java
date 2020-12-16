package com.miguelcaetano.hyperskill.basic_syntax.difference_between_two_doubles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = Double.valueOf(scanner.nextLine());
        double second = Double.valueOf(scanner.nextLine());
        System.out.println(second - first);
    }
}
