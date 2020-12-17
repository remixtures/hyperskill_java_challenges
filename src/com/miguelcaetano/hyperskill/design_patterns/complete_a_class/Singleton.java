package com.miguelcaetano.hyperskill.design_patterns.complete_a_class;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        return instance;
    }
}
