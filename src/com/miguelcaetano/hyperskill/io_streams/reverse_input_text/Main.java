package com.miguelcaetano.hyperskill.io_streams.reverse_input_text;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String reverse = new StringBuilder(line).reverse().toString();
        System.out.println(reverse);
        reader.close();
    }
}
