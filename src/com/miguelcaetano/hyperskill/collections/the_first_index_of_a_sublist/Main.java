package com.miguelcaetano.hyperskill.collections.the_first_index_of_a_sublist;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringsOne = scanner.nextLine();
        List<String> firstListOfStrings = Arrays.asList(stringsOne.split(" "));
        List<Integer> firstListOfIntegers = firstListOfStrings.stream()
                .map(Integer::valueOf).collect(Collectors.toList());

        String stringsTwo = scanner.nextLine();
        List<String> secondListOfStrings = Arrays.asList(stringsTwo.split(" "));
        List<Integer> secondListOfIntegers = secondListOfStrings.stream().
                map(Integer::valueOf).collect(Collectors.toList());

        System.out.print(Collections.indexOfSubList(firstListOfIntegers, secondListOfIntegers));
        System.out.print(" ");
        System.out.print(Collections.lastIndexOfSubList(firstListOfIntegers, secondListOfIntegers));
    }
}
