package com.miguelcaetano.hyperskill.functional_programming.production_of_all_numbers_in_the_range;

import java.util.function.LongBinaryOperator;

class Operator {

    public static LongBinaryOperator binaryOperator = (start, end) -> {
        long productOfRange = 1;
        for (long i = start; i <= end; i++) {
            productOfRange *= i;
        }
        return productOfRange;
    };
}
