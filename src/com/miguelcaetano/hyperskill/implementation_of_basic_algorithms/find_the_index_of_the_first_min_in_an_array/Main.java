package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.find_the_index_of_the_first_min_in_an_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int findIndexOfMin(int[] numbers) {
        // write your code here
        if (numbers.length == 0) {
            return -1;
        } else if (numbers.length == 1) {
            return numbers[0];
        }

        int minValue = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number <= minValue) {
                minValue = number;
            }
        }

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] == minValue) {
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
        System.out.println(findIndexOfMin(numbers));
    }
}
