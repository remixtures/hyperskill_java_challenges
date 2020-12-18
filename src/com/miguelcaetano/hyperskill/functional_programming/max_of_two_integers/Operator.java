package com.miguelcaetano.hyperskill.functional_programming.max_of_two_integers;

import java.util.function.IntBinaryOperator;

public class Operator {

    public static IntBinaryOperator binaryOperator = (x, y) -> x > y ? x : y;
}
