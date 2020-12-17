package com.miguelcaetano.hyperskill.multithreading.message_notifier_as_thread;

public class MessageNotifier extends Thread {

    private String msg;
    private int repeats;

    // write fields to store variables here

    public MessageNotifier(String msg, int repeats) {
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeats; i++) {
            System.out.println(msg);
        }
    }
}