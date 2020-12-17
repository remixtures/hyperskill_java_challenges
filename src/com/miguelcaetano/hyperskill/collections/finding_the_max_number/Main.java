package com.miguelcaetano.hyperskill.collections.finding_the_max_number;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int findMaxByIterator(Iterator<Integer> iterator) {
        int max = 0;
        while (iterator.hasNext()) {
            int current = iterator.next();
            if (max < current) {
                max = current;
            }
        }
        return max;
    }

    /* Do not change code below */
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(findMaxByIterator(list.iterator()));
    }
}
