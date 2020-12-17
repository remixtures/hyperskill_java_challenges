package com.miguelcaetano.hyperskill.multithreading.starting_runnables;

class Starter {

    public static void startRunnables(Runnable[] runnables) {
        for (Runnable runnableThread : runnables) {
            Thread thread = new Thread(runnableThread);
            thread.start();
        }
    }
}
