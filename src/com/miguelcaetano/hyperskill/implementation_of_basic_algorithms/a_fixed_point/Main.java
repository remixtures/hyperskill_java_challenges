package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.a_fixed_point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int[] numbersArray = new int[size];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = input.nextInt();
        }
        if (binarySearch(numbersArray, 0, size - 1) != -1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static int binarySearch(int[] array, int low, int high) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (mid == array[mid]) {
                return mid;
            }
            if (mid > array[mid]) {
                return binarySearch(array, mid + 1, high);
            } else {
                return binarySearch(array, low, mid - 1);
            }
        }
        return -1;
    }
}
