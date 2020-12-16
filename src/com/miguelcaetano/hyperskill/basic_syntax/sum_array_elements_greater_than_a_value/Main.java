package com.miguelcaetano.hyperskill.basic_syntax.sum_array_elements_greater_than_a_value;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int n = input.nextInt();
        int sum = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] > n) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }
}