package com.miguelcaetano.hyperskill.basic_syntax.initializing_an_array_of_longs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        long[] longNumbers;

        longNumbers = new long[]{100_000_000_001L, 100_000_000_002L, 100_000_000_003L};

        System.out.println(Arrays.toString(longNumbers));
    }
}