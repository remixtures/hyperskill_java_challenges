package com.miguelcaetano.hyperskill.basic_syntax.the_sum_of_array_elements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        System.out.println(sum);

    }
}
