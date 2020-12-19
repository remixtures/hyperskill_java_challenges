package com.miguelcaetano.hyperskill.functional_programming.an_infinite_numbers_supplier;

import java.util.function.*;

public class FunctionUtils {

    private int number;

    public int getNumber() {
        return number;
    }

    public static Supplier<Integer> getInfiniteRange() {
        FunctionUtils functionUtils = new FunctionUtils() {
            int number = 0;

            @Override
            public int getNumber() {
                return number++;
            }
        };
        return () -> functionUtils.getNumber();
    }
}
