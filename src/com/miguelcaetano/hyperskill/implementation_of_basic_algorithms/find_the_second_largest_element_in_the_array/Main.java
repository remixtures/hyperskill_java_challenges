package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.find_the_second_largest_element_in_the_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int findSecondLargestNumber(int[] numbers) {
        // write your code here
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        return secondLargest;
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
        System.out.println(findSecondLargestNumber(numbers));
    }
}
