package com.miguelcaetano.hyperskill.basic_syntax.compression_algorithm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        word += "\n";
        char current = word.charAt(0);
        int count = 1;

        if (word.length() == 1) {
            System.out.println(String.valueOf(current));
            System.exit(0);
        }

        for (int i = 1; i < word.length(); i++) {
            char next = word.charAt(i);
            if (current != next) {
                System.out.print(String.valueOf(current) + count);
                count = 1;
            } else {
                count++;
            }

            current = next;
        }
    }
}
