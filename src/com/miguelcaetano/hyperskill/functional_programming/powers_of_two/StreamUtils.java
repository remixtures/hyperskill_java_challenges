package com.miguelcaetano.hyperskill.functional_programming.powers_of_two;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamUtils {

    public static Stream<Integer> generateStreamWithPowersOfTwo(int n) {
        return Stream.iterate(1, x -> x * 2)
                .limit(n);
    }
}
