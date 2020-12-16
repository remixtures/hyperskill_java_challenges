package com.miguelcaetano.hyperskill.basic_syntax.triples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int triple = 0;

        for (int i = 1; i < size; i++) {
            if (i + 1 < size && array[i] - array[i - 1] == 1 && array[i + 1] - array[i] == 1) {
                triple++;
            }
        }
        System.out.println(triple);
    }
}
