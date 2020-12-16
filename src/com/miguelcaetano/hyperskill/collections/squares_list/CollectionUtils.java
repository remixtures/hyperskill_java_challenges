package com.miguelcaetano.hyperskill.collections.squares_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        Collection<Integer> poweredNumbers = new ArrayList<>();
        for (int number : numbers) {
            poweredNumbers.add((int) Math.pow(number, 2));
        }
        numbers.clear();
        numbers.addAll(poweredNumbers);
        return numbers;
    }
}

/* Please, do not modify this I/O code */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collection<Integer> result = CollectionUtils.pow2(numbers);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
