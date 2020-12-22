package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.count_the_number_of_merge_operations;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(array.length - 1);
    }
}
