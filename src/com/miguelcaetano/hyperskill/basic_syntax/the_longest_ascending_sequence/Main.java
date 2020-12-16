package com.miguelcaetano.hyperskill.basic_syntax.the_longest_ascending_sequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int maxSequence = 1;
        int sequence = 1;

        for (int i = 0; i < size - 1; i++) {
            if (array[i] < array[i + 1]) {
                sequence++;
            } else {
                sequence = 1;
            }
            if (maxSequence < sequence) {
                maxSequence = sequence;
            }
        }

        if (size < 2) {
            System.out.println(1);
        } else {
            System.out.println(maxSequence);
        }
    }
}
