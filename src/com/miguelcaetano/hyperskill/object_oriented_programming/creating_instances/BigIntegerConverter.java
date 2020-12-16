package com.miguelcaetano.hyperskill.object_oriented_programming.creating_instances;

public class BigIntegerConverter {

    /**
     * @param number string representing the number
     * @return BigInteger instance
     */
    public static Number getBigInteger(String number) {
        return new java.math.BigInteger(number);
    }
}
