package com.miguelcaetano.hyperskill.basic_syntax.the_sequence_ii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int countNumbers = 0;

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                if (countNumbers == number) {
                    break;
                }
                System.out.print(i + " ");
                countNumbers++;
            }
        }
    }
}
