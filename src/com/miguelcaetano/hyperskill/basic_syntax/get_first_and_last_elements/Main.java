package com.miguelcaetano.hyperskill.basic_syntax.get_first_and_last_elements;

import java.util.*;

public class Main {

    public static int[] getFirstAndLast(int[] array) {
        return new int[]{array[0], array[array.length - 1]};
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}