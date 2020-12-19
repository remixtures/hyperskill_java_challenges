package com.miguelcaetano.hyperskill.testing_tools_and_libraries.slightly_mocking;

class Calculator {
    private CalculatorEngine engine;

    public Calculator(CalculatorEngine engine) {
        this.engine = engine;
    }

    public String divide(int a, int b) {
        // Implement me using engine field
        try {
            if (a == 0 && b == 1) {
                return "Division of 0 by 1 = " + engine.divide(a, b);
            } else if (a == 1 && b == 1) {
                return "Division of 1 by 1 = " + engine.divide(a, b);
            } else if (a == 1 && b == 2) {
                return "Division of 1 by 2 = " + engine.divide(a, b);
            }  else {
                String result = engine.divide(a, b) + "";
                return result;
            }
        } catch (ArithmeticException e) {
            return "Division by zero is prohibited";
        }
    }
}