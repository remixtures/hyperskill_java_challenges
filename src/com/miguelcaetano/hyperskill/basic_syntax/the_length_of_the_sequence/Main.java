package com.miguelcaetano.hyperskill.basic_syntax.the_length_of_the_sequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int value;
        do {
            value = scanner.nextInt();
            if (value != 0) {
                numbers++;
            }
        } while (value != 0);

        System.out.println(numbers);
    }
}
