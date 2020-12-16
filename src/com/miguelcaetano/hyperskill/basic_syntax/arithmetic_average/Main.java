package com.miguelcaetano.hyperskill.basic_syntax.arithmetic_average;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = 0;
        int numbers = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                numbers++;
            }
        }

        System.out.println((double) sum / numbers);

    }
}