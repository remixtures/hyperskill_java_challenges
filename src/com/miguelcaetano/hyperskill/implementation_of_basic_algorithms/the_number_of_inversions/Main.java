package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.the_number_of_inversions;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(countInversions(array));
    }
    private static long countInversions(int[] array) {
        int[] temp = array.clone();
        return countInversions(array, 0, array.length - 1, temp);
    }

    private static long countInversions(int[] array, int left, int right, int[] temp) {
        if (left >= right) {
            return 0;
        }

        int mid = left + (right - left) / 2;

        long count = 0;
        count += countInversions(temp, left, mid, array);
        count += countInversions(temp, mid + 1, right, array);
        count += merge(array, left, mid, right, temp);

        return count;
    }

    private static long merge(int[] array, int left, int middle, int right, int[] temp) {
        long count = 0;
        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle || j <= right) {
            if (i > middle) {
                array[k++] = temp[j++];
            } else if (j > right) {
                array[k++] = temp[i++];
            } else if (temp[i] <= temp[j]) {
                array[k++] = temp[i++];
            } else {
                array[k++] = temp[j++];
                count += middle + 1 - i;
            }
        }

        return count;
    }
}