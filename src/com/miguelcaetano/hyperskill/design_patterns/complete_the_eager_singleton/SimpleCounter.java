package com.miguelcaetano.hyperskill.design_patterns.complete_the_eager_singleton;

public class SimpleCounter {

    private static SimpleCounter instance = new SimpleCounter();
    public int counter = 0;

    private SimpleCounter() {

    }

    public static SimpleCounter getInstance() {
        return instance;
    }
}
