package com.miguelcaetano.hyperskill.multithreading.ordering_the_execution_of_threads;

public class Invoker {

    public static void invokeMethods(Thread t1, Thread t2, Thread t3) throws InterruptedException {
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
        t1.join();
    }
}
