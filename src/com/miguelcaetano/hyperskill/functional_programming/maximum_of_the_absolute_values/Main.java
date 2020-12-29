package com.miguelcaetano.hyperskill.functional_programming.maximum_of_the_absolute_values;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * Returns the largest absolute value in the array of numbers.
     *
     * @param numbers the input array of String integer numbers
     * @return the maximum integer absolute value in the array
     */
    public static int maxAbsValue(String[] numbers) {
        // write your code here
       return Arrays.stream(numbers)
                    .mapToInt(Integer::parseInt)
                    .map(number -> Math.abs(number)).max()
                    .getAsInt();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(maxAbsValue(scanner.nextLine().split("\\s+")));
    }
}
