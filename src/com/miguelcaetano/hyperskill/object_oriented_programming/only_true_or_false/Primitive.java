package com.miguelcaetano.hyperskill.object_oriented_programming.only_true_or_false;

public class Primitive {
    public static boolean toPrimitive(Boolean b) {
        if (b != null) {
            if (b.equals(true) || b.equals(false)) {
                return b.booleanValue();
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}