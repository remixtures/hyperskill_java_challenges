package com.miguelcaetano.hyperskill.multithreading.execute_callable_objects;

import java.util.List;
import java.util.concurrent.*;

class FutureUtils {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        // write your code here
        int sumOfValues = 0;
        try {
            for (int i = items.size() - 1; i >= 0; i--) {
                Callable<Integer> x = items.get(i).get();
                sumOfValues = sumOfValues + x.call();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sumOfValues;
    }
}
