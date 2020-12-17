package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.finding_a_collection_of_elements_in_a_sorted_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeOne = Integer.parseInt(input.next());
        int[] searchArray = new int[sizeOne];
        for (int i = 0; i < sizeOne; i++) {
            searchArray[i] = input.nextInt();
        }
        int sizeTwo = Integer.parseInt(input.next());
        int[] findArray = new int[sizeTwo];
        for (int j = 0; j < sizeTwo; j++) {
            findArray[j] = input.nextInt();
        }
        int[] resultArray = binarySearch(searchArray, findArray);
        for (int number : resultArray) {
            System.out.print(number + " ");
        }
    }

    private static int[] binarySearch(int[] array, int[] elems) {
        int[] result = new int[elems.length];

        for (int i = 0; i < elems.length; i++) {
            int elem = elems[i];
            int left = 0;
            int right = array.length - 1;
            int mid = -1;

            while (left <= right) {
                mid = left + (right - left) / 2; // the index of the middle element

                if (elem == array[mid]) {
                    result[i] = mid + 1;
                    break;
                } else if (elem < array[mid]) {
                    right = mid - 1; // go to the left subarray
                } else {
                    left = mid + 1;  // go the the right subarray
                }
            }

            if (mid != -1 && elem != array[mid]) {
                result[i] = -1;
            }
        }
        return result;
    }
}