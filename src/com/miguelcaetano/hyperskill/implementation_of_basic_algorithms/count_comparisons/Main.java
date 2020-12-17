package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.count_comparisons;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int[] numberArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numberArray[i] = input.nextInt();
        }
        int targetValue = input.nextInt();

        System.out.println(countComparisons(numberArray, targetValue));
    }

    private static int countComparisons(int[] numberArray, int targetValue) {
        int currentRight = 0;
        int prevRight = 0;
        int count = 1;

        if (numberArray.length == 0) {
            return count;
        }

        if (numberArray[currentRight] == targetValue) {
            return count;
        }

        int jumpLength = (int) Math.sqrt(numberArray.length);

        while (currentRight < numberArray.length - 1) {
            currentRight = Math.min(numberArray.length - 1, currentRight + jumpLength);
            count++;

            if (numberArray[currentRight] >= targetValue) {
                for (int i = currentRight; i > prevRight; i--) {
                    if (numberArray[i] == targetValue) {
                        return count;
                    } else if (numberArray[i] < targetValue) {
                        return count;
                    }
                    count++;
                }

                if (prevRight < targetValue) {
                    return count - 1;
                }
            }
            prevRight = currentRight;
        }
        return count;
    }
}
