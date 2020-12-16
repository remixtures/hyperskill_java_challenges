package com.miguelcaetano.hyperskill.basic_syntax.the_maximum_product_of_adjacent_elements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int product = 0;
        int maximumProduct = 0;
        for (int i = 0; i < size - 1; i++) {
            maximumProduct = array[i] * array[i + 1];
            for (int j = 0; j < size - 1; j++) {
                product = array[j] * array[j + 1];
                if (maximumProduct < product) {
                    maximumProduct = product;
                }
            }
        }

        System.out.println(maximumProduct);
    }
}
