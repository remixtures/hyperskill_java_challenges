package com.miguelcaetano.hyperskill.basic_syntax.two_numbers_never_occur_next_to_each_other;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
        }
        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean notAdjacent = true;

        for (int i = 0; i < arraySize - 1; i++) {
            if (array[i] == n && array[i + 1] == m) {
                notAdjacent = false;
            }

            if (array[i] == m  && array[i + 1] == n) {
                notAdjacent = false;
            }
        }
        System.out.println(notAdjacent);
    }
}
