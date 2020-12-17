package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.partial_sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbersArray = new int[size];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(input.next());
        }
        int elements = input.nextInt();

        partialSorting(numbersArray, elements);
        for (int i = 0; i < elements; i++) {
            System.out.print(numbersArray[i] + " ");
        }
    }

    private static int[] partialSorting(int[] numbersArray, int elements) {
        for (int i = 0; i < elements; i++) {
            int index = i;
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[index] < numbersArray[j]) {
                    index = j;
                }
            }
            int temp = numbersArray[index];
            numbersArray[index] = numbersArray[i];
            numbersArray[i] = temp;
        }
        return numbersArray;
    }
}