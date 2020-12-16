package com.miguelcaetano.hyperskill.object_oriented_programming.calculator;

class CalculatorCreator {

    public static Calculator createInstance() {

        return new Calculator() {

            @Override
            public long sum(long val1, long val2) {
                return val1 + val2;
            }

            @Override
            public long subtraction(long val1, long val2) {
                return val1 - val2;
            }
        };
    }
}

abstract class Calculator {

    public abstract long sum(long val1, long val2);

    public abstract long subtraction(long val1, long val2);
}
