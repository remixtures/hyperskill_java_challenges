package com.miguelcaetano.hyperskill.basic_syntax.adding_values;

import java.util.*;

public class Main {

    // write a method here
    public static void addValueByIndex(long[] arr, int index, long value) {
        arr[index] += value;
    }

    // don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}

