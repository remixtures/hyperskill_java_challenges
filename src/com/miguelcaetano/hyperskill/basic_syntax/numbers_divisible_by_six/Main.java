package com.miguelcaetano.hyperskill.basic_syntax.numbers_divisible_by_six;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = Integer.valueOf(input.nextLine());

        int sum = 0;

        for (int i = 0; i < size; i++) {
            int number = Integer.valueOf(input.nextLine());
            if (number % 6 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);

    }
}
