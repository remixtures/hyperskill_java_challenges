package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.print_comparisons;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbersArray = new int[size];
        for (int i = 0; i < size; i++) {
            numbersArray[i] = i;
        }

        for (int number : numbersArray) {
            System.out.print(jumpSearch(numbersArray, number) + " ");
        }
    }

    public static int jumpSearch(int[] array, int target) {
        int currentRight = 0;
        int prevRight = 0;
        int count = 0;

        if (array[currentRight] == target) {
            return 1;
        }

        int jumpLength = (int) Math.sqrt(array.length);

        while (currentRight < array.length - 1) {
            currentRight = Math.min(currentRight + jumpLength, array.length - 1);
            count++;
            if (target <=  array[currentRight]) {
                break;
            }
            prevRight = currentRight;
        }

        for (int i = currentRight; i >= prevRight; i--) {
            count++;
            if (array[i] == target) {
                break;
            }
        }
        return count;
    }
}
