package com.miguelcaetano.hyperskill.multithreading.starting_threads;

public class Main {

    public static void main(String[] args) {
        Thread first = new Thread(new RunnableWorker());
        Thread second = new Thread(new RunnableWorker());
        Thread third = new Thread(new RunnableWorker());
        first.setName("worker-1");
        second.setName("worker-2");
        third.setName("worker-3");
        first.start();
        second.start();
        third.start();
    }
}

// Don't change the code below
class RunnableWorker implements Runnable {

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (name.startsWith("worker-")) {
            System.out.println("too hard calculations...");
        } else {
            return;
        }
    }
}