package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.find_the_index_of_k_min_in_an_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int findIndexOfKMin(int[] numbers, int k) {
        // write your code here
        if (numbers.length == 0) {
            return -1;
        }

        int minValue = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == minValue) {
                counter++;
                if (counter == k) {
                    return i;
                }
            }
        }

        return -1;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int k;
        final int[] numbers;
        if (scanner.hasNextInt()) {
            numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            k = Integer.parseInt(scanner.nextLine());
        } else {
            numbers = new int[0];
            k = 1;
        }
        System.out.println(findIndexOfKMin(numbers, k));
    }
}