package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.merge_all_sequences;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfArrays = input.nextInt();

        int[] mergedArray = new int[0];
        for (int i = 0; i < numberOfArrays; i++) {
            int size = input.nextInt();

            int[] subArray = new int[size];
            for (int j = 0; j < subArray.length; j++) {
                subArray[j] = input.nextInt();
            }

            mergedArray = merge(mergedArray, subArray);
        }

        for (int number : mergedArray) {
            System.out.print(number + " ");
        }
    }

    public static int[] merge(int[] resultingArray, int[] originalSubArray) {
        int[] sortedDescendingArray = new int[resultingArray.length + originalSubArray.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < resultingArray.length && j < originalSubArray.length) {
            if (resultingArray[i] >= originalSubArray[j]) {
                sortedDescendingArray[k] = resultingArray[i];
                i++;
            } else {
                sortedDescendingArray[k] = originalSubArray[j];
                j++;
            }
            k++;
        }

        for (; i < resultingArray.length; i++) {
            sortedDescendingArray[k] = resultingArray[i];
            k++;
        }

        for (; j < originalSubArray.length; j++) {
            sortedDescendingArray[k] = originalSubArray[j];
            k++;
        }

        return sortedDescendingArray;
    }
}