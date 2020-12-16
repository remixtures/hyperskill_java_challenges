package com.miguelcaetano.hyperskill.essential_standard_classes.double_factorial;

import java.math.BigInteger;

public class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = n; i > 0; i -= 2) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}