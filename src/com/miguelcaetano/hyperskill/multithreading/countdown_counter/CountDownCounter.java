package com.miguelcaetano.hyperskill.multithreading.countdown_counter;

public class CountDownCounter {

    int count;

    public CountDownCounter(int initial) {
        this.count = initial;
    }

    public synchronized void decrement() {
        count--;
    }
}
