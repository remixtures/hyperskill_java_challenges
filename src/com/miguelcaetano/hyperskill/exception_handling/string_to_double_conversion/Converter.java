package com.miguelcaetano.hyperskill.exception_handling.string_to_double_conversion;

public class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (RuntimeException e) {
            return 0;
        }
    }
}
