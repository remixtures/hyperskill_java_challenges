package com.miguelcaetano.hyperskill.multithreading.multithreaded_counter;

public class Counter {

    int count = 0;

    public synchronized void inc() {
        count++;
    }
}