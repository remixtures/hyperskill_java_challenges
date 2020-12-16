package com.miguelcaetano.hyperskill.basic_syntax.interval;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (-15 < number && number <= 12 || 14 < number && number < 17 || 19 <= number) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}