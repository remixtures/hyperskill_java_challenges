package com.miguelcaetano.hyperskill.functional_programming.ternary_predicate;

public class Predicate {

    public static TernaryIntPredicate allValuesAreDifferentPredicate = (a, b, c) -> a != b && b != c && a != c;

    @FunctionalInterface
    public interface TernaryIntPredicate {
        public boolean test(int a, int b, int c);
    }

}