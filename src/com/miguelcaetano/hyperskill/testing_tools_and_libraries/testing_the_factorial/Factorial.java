package com.miguelcaetano.hyperskill.testing_tools_and_libraries.testing_the_factorial;

public class Factorial {

    public long get(int x) {

        long result = 1;

        for (int factor = 2; factor <= x; factor++) {
            result *= factor;
        }

        if (x >= 0) {
            return result;
        } else {
            return -1;
        }
    }
}
