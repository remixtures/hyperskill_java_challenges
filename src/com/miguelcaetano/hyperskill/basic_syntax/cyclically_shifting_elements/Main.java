package com.miguelcaetano.hyperskill.basic_syntax.cyclically_shifting_elements;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int[] shiftedArray = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        if (size == 1) {
            shiftedArray[0] = array[0];
        } else {
            for (int i = 0; i < size - 1; i++) {
                shiftedArray[i + 1] = array[i];
                shiftedArray[0] = array[size - 1];
            }
        }

        for (int number : shiftedArray) {
            System.out.print(number + " ");
        }
    }
}
