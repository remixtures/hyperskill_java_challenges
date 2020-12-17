package com.miguelcaetano.hyperskill.multithreading.handling_interruptions;

public class CounterThread extends Thread {

    @SuppressWarnings("unused")
    @Override
    public void run() {
        long counter = 0;

        while (true) {
            if (!isInterrupted()) {
                counter++;
            } else {
                System.out.println("It was interrupted");
                break;
            }
        }
    }
}
