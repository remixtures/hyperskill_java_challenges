package com.miguelcaetano.hyperskill.basic_syntax.check_if_an_array_contains_two_numbers;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int m = input.nextInt();
        int n = input.nextInt();
        String result = "false";
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == m && array[i + 1] == n || array[i] == n && array[i + 1] == m) {
                result = "true";
            }
        }
        System.out.println(result);
    }
}