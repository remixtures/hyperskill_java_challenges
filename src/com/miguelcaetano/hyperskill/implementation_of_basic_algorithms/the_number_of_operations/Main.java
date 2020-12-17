package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.the_number_of_operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfArrays = input.nextInt();
        int sizeOfEachArray = input.nextInt();
        int[][] arrays = new int[numberOfArrays][];
        int[] countArray = new int[numberOfArrays];
        for (int i = 0; i < numberOfArrays; i++) {
            arrays[i] = new int[sizeOfEachArray];
            for (int j = 0; j < sizeOfEachArray; j++) {
                arrays[i][j] = input.nextInt();
            }
            countArray[i] = selectionSort(arrays[i]);
        }
        System.out.println(findLargest(countArray));
    }

    public static int selectionSort(int[] array) {
        int operations = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            operations++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                    operations++;
                }
            }

            int min = array[index];
            operations++;
            array[index] = array[i];
            operations++;
            array[i] = min;
            operations++;
        }

        return operations;
    }

    public static int findLargest(int[] numbers) {
        int maxAt = 0;

        for (int i = 0; i < numbers.length; i++) {
            maxAt = numbers[i] > numbers[maxAt] ? i : maxAt;
        }
        return maxAt + 1;
    }
}
