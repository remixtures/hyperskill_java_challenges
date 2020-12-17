package com.miguelcaetano.hyperskill.multithreading.finding_and_starting_a_thread;

public class ThreadProcessor {
    public static void findAndStartThread(Thread... threads) throws InterruptedException {
        for (Thread singleThread : threads) {
            if (singleThread.getState().equals(Thread.State.NEW)) {
                singleThread.start();
                singleThread.join();
                break;
            }
        }
    }
}
