package com.miguelcaetano.hyperskill.functional_programming.disjunct_all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class CombiningPredicates {

    /**
     * The method represents a disjunct operator for a list of predicates.
     * For an empty list it returns the always false predicate.
     */
    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        return predicates.stream().reduce(x -> false, IntPredicate::or);
    }

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        List<Boolean> values = Arrays.stream(strings)
                .map(Boolean::parseBoolean)
                .collect(Collectors.toList());

        List<IntPredicate> predicates = new ArrayList<>();
        values.forEach(v -> predicates.add(x -> v));

        System.out.println(disjunctAll(predicates).test(0));
    }
}
