package com.miguelcaetano.hyperskill.collections.reversed_list;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static <T> List<T> createReversedListByIterator(ListIterator<T> iterator) {
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()) {
            T temp = iterator.next();
            list.add(temp);
        }
        Collections.reverse(list);
        return list;
    }

    /* Do not change the code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        createReversedListByIterator(list.listIterator())
                .forEach(e -> System.out.print(e + " "));
    }
}

