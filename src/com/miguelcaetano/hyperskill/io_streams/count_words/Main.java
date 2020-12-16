package com.miguelcaetano.hyperskill.io_streams.count_words;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder inputString = new StringBuilder();
            int data = reader.read();
            while (data != -1) {
                inputString.append((char) data);
                data = reader.read();
            }
            if (inputString.toString().isBlank()) {
                System.out.println(0);
            } else {
                String[] countWords = inputString.toString().trim().split("\\s+");
                System.out.println(countWords.length);
            }
        }
    }
}
