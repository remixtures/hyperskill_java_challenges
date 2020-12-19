package com.miguelcaetano.hyperskill.functional_programming.next_even_number;

import java.util.function.LongUnaryOperator;

public class Operator {

    public static LongUnaryOperator unaryOperator = x -> (x % 2 == 0) ? x + 2 : x + 1;
}
