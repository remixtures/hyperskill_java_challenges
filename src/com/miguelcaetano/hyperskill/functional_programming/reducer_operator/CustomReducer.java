package com.miguelcaetano.hyperskill.functional_programming.reducer_operator;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.stream.*;

public class CustomReducer {

    /**
     * The operator combines all values in the given range into one value
     * using combiner and initial value (seed)
     */
    public static final BiFunction<Integer, IntBinaryOperator, IntBinaryOperator> REDUCE_INT_OPERATOR =
            (a, f) -> (x, y) -> IntStream.rangeClosed(x, y).reduce(a, f);


    /**
     * The operator calculates the sum in the given range (inclusively)
     */
    public static final IntBinaryOperator SUM_OPERATOR =
            (a, b) -> IntStream.rangeClosed(a, b).reduce(0, (x, y) -> x + y);


    /**
     * The operator calculates the product in the given range (inclusively)
     */
    public static final IntBinaryOperator PRODUCT_OPERATOR =
            (a, b) -> IntStream.rangeClosed(a, b).reduce(1, (x, y) -> x * y);

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");

        int l = Integer.parseInt(values[0]);
        int r = Integer.parseInt(values[1]);

        int sumReducer = REDUCE_INT_OPERATOR.apply(0, Integer::sum).applyAsInt(l, r);
        int sum = SUM_OPERATOR.applyAsInt(l, r);

        int prodReducer = REDUCE_INT_OPERATOR.apply(1, (x, y) -> x * y).applyAsInt(l, r);
        int prod = PRODUCT_OPERATOR.applyAsInt(l, r);

        System.out.println(String.format("%d %d %d %d", sumReducer, sum, prodReducer, prod));
    }
}
