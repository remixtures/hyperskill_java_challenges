package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.sorting_characters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] counts = new int[10];

        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            counts[input.next().charAt(0) - 'a']++;
        }

        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                System.out.print((char) (i + 'a') + " ");
                counts[i]--;
            }
        }
    }
}