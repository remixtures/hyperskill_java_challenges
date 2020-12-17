package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.find_a_values_index;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = readArray(scanner.nextLine());
        int value = scanner.nextInt();

        int index = findIndex(numbers, value);
        System.out.println(index);
    }

    static int findIndex(int[] numbers, int value) {
        List<Integer> listOfIndexes = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                listOfIndexes.add(i);
            }
        }
        if (!listOfIndexes.isEmpty()) {
            return Collections.max(listOfIndexes);
        } else {
            return -1;
        }
    }

    // utility class for parsing int[], do not change it
    private static int[] readArray(String line) {
        String[] strings = line.trim().split(" ");
        int[] numbers = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

        return numbers;
    }
}
