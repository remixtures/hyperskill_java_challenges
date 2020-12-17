package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.descending_sorting_swaps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] tokens = line.split("\\s+");
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println(countSwaps(numbers));
    }

    public static int countSwaps(int[] numbers) {
        int swaps = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    swaps++;
                    numbers[j + 1] = temp;
                }
            }
        }
        return swaps;
    }
}
