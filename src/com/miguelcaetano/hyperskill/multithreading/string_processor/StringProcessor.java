package com.miguelcaetano.hyperskill.multithreading.string_processor;

import java.util.Scanner;

public class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {

        while (true) {
            String str = scanner.nextLine();
            if (str.matches(".*[a-z].*")) {
                System.out.println(str.toUpperCase());
            } else {
                System.out.print("FINISHED");
                break;
            }
        }
    }
}