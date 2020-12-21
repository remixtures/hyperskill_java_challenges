package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.find_the_min_in_an_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int findMin(int[] numbers) {
        // write your code here
        int minValue = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }

        return minValue;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(findMin(numbers));
    }
}