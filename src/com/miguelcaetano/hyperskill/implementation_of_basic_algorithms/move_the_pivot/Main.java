package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.move_the_pivot;

import java.util.*;

public class Main {

    public static void moveThePivot(int[] array, int pivotIndex) {
        int left = 0;
        int right = array.length - 1;
        int pivot = array[pivotIndex];
        int partitionIndex = left;
        swap(array, pivotIndex, right);

        for (int i = left; i < right; i++) {
            if (array[i] <= pivot) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }

        swap(array, partitionIndex, right);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int pivotIndex = scanner.nextInt();
        moveThePivot(array, pivotIndex);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}