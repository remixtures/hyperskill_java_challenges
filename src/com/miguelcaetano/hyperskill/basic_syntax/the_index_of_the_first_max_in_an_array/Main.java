package com.miguelcaetano.hyperskill.basic_syntax.the_index_of_the_first_max_in_an_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int max = 0;
        int indexOfMax = 0;

        for (int i = 0; i < size; i++) {
            if (max < array[i]) {
                max = array[i];
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);
    }
}