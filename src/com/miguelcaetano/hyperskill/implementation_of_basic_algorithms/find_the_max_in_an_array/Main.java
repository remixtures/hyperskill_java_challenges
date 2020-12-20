package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.find_the_max_in_an_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int findMax(int[] numbers) {
        // write your code here
        int maxValue = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }

        return maxValue;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(findMax(numbers));
    }
}
