package com.miguelcaetano.hyperskill.basic_syntax.does_an_array_contain_n;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        boolean result = false;
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int numberToFind = input.nextInt();
        for (int i = 0; i < size; i++) {
            if (array[i] == numberToFind) {
                result = true;
            }
        }
        System.out.println(result);
    }
}