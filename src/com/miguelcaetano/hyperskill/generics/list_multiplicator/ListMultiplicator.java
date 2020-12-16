package com.miguelcaetano.hyperskill.generics.list_multiplicator;

import java.util.List;

/**
 Class to modify
 */
public class ListMultiplicator {

    /**
     Repeats original list content provided number of times
     @param list list to repeat
     @param n times to repeat, should be zero or greater
     */
    public static void multiply(List<?> list, int n) {
        // Add implementation here
        if (n == 0) {
            list.clear();
        } else {
            multiplyList(list, n);
        }
    }

    private static <T> void multiplyList(List<T> list, int n) {
        int originalSize = list.size();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < originalSize; j++) {
                list.add(list.get(j));
            }
        }
    }
}