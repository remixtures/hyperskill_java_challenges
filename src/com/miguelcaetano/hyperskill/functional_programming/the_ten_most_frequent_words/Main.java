package com.miguelcaetano.hyperskill.functional_programming.the_ten_most_frequent_words;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] line = input.nextLine().trim().split("[\\p{Punct}\\s]+");

        Arrays.stream(line)
                .collect(Collectors.toMap(i -> i.toLowerCase(), i -> 1, Integer::sum))
                .entrySet()
                .stream()
                .sorted((first, second) -> second.getValue() == first.getValue()
                        ? first.getKey().compareTo(second.getKey())
                        : second.getValue() - first.getValue())
                .limit(10)
                .forEach(first -> System.out.println(first.getKey()));
    }
}
