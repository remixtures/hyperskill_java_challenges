package com.miguelcaetano.hyperskill.multithreading.getting_current_thread_info;

public class Info {

    public static void printCurrentThreadInfo() {
        Thread newThread = Thread.currentThread(); // main thread
        System.out.println("name: " + newThread.getName());
        System.out.println("priority: " + newThread.getPriority());
    }
}
