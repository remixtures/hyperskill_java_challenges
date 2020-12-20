package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.not_only_non_negative_numbers;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void countingSort(int[] numbers) {
        int minVal = -10;
        int maxVal = 20;
        int[] counts = new int[maxVal - minVal + 1];
        for (int number : numbers) {
            counts[number - minVal] += 1;
        }

        int index = 0;
        for (int num = 0; num < counts.length; num++) {
            while (counts[num] > 0) {
                counts[num] -= 1;
                numbers[index++] = num + minVal;
            }
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String elements = scanner.nextLine();
        final int[] array = Arrays.stream(elements.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        countingSort(array);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}