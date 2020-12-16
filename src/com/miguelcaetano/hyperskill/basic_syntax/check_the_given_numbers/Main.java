package com.miguelcaetano.hyperskill.basic_syntax.check_the_given_numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        System.out.println(first != second && second != third && third != first);
    }
}
