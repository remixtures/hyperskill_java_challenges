package com.miguelcaetano.hyperskill.multithreading.messaging;

public class Main {

    public static void main(String[] args) {
        AsyncMessageSender sender = new AsyncMessageSenderImpl(3);

        Message[] messages = {

                new Message("John", "Mary", "Hello!"),
                new Message("Clara", "Bruce", "How are you today?")
        };

        sender.sendMessages(messages);
        sender.stop();

        System.out.println("Completed.");
    }

}
