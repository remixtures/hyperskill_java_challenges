package com.miguelcaetano.hyperskill.collections.filtering_the_list;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final List<String> values = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        List<Integer> numbers = new ArrayList<>();
        for (String value : values) {
            numbers.add(Integer.parseInt(value));
        }


        for (int index = numbers.size() - 1; index >= 0; index--) {
            if (index % 2 == 0) {
                numbers.remove(index);
            }
        }

        Collections.reverse(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
