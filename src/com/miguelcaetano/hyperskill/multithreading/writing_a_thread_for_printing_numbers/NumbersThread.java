package com.miguelcaetano.hyperskill.multithreading.writing_a_thread_for_printing_numbers;

public class NumbersThread extends Thread {

    private int from;
    private int to;

    public NumbersThread(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        while (from <= to) {
            System.out.println(from);
            from++;
        }
    }
}