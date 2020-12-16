package com.miguelcaetano.hyperskill.basic_syntax.check_if_an_array_is_sorted_ascending;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int endValue = input.nextInt();
        int[] array = new int[endValue];
        boolean isAscending = true;
        for (int i = 0; i < endValue; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < endValue - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isAscending = false;
                break;
            }
        }
        System.out.println(isAscending);
    }
}