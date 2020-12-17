package com.miguelcaetano.hyperskill.multithreading.multiple_threads;

public class Main {

    public static void main(String[] args) {

        Thread firstThread = new WorkerThread();
        Thread secondThread = new WorkerThread();
        firstThread.setName("worker-1");
        secondThread.setName("worker-2");
        firstThread.start();
        secondThread.start();
    }
}

// Don't change the code below
class WorkerThread extends Thread {

    private static final int NUMBER_OF_LINES = 3;

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (!name.startsWith("worker-")) {
            return;
        }

        for (int i = 0; i < NUMBER_OF_LINES; i++) {
            System.out.println("do something...");
        }
    }
}
