package com.miguelcaetano.hyperskill.multithreading.interrupting_a_thread;

public class InterruptedExample {

    private static long mainThreadId = Thread.currentThread().getId();

    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();

        // write your code here
        worker.start();
        Thread.sleep(3000L);
        worker.interrupt();
    }

    // Don't change the code below
    static class Worker extends Thread {

        @Override
        public void run() {

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException("You need to wait longer!", e);
            }

            final long currentId = Thread.currentThread().getId();

            if (currentId == mainThreadId) {
                throw new RuntimeException("You must start a new thread!");
            }

            while (true) {
                if (isInterrupted()) {
                    System.out.println("Interrupted");
                    break;
                }
            }
        }
    }
}
