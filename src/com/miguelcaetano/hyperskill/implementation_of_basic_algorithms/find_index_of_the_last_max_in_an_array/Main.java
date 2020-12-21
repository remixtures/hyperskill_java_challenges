package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.find_index_of_the_last_max_in_an_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int findIndexOfLastMax(int[] numbers) {
        // write your code here
        if (numbers.length == 0) {
            return -1;
        } else if (numbers.length == 1) {
            return 0;
        }

        int maxValue = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number >= maxValue) {
                maxValue = number;
            }
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == maxValue) {
                return i;
            }
        }

        return -1;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] numbers;
        if (scanner.hasNextInt()) {
            numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } else {
            numbers = new int[0];
        }
        System.out.println(findIndexOfLastMax(numbers));
    }
}