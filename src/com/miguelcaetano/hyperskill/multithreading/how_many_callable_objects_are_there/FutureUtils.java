package com.miguelcaetano.hyperskill.multithreading.how_many_callable_objects_are_there;

import java.util.concurrent.Callable;

public class FutureUtils {

    public static int determineCallableDepth(Callable callable) throws Exception {
        int depth = 1;
        Object caller = callable.call();
        if (caller instanceof Callable) {
            depth += determineCallableDepth((Callable) caller);
        }

        return depth;
    }
}