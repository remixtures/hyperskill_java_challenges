package com.miguelcaetano.hyperskill.basic_syntax.check_sudoku;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int size = (int) Math.pow(n, 2);
        int sum = 0;
        int rowSum = 0;
        int columnSum = 0;
        int squareSum = 0;
        boolean isSolved = true;

        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = input.nextInt();
            }
        }

        sum = (1 + size) * size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rowSum += array[i][j];
                columnSum += array[j][i];
            }
            if (rowSum == sum && columnSum == sum) {
                rowSum = 0;
                columnSum = 0;
            } else {
                isSolved = false;
                break;
            }
        }

        for (int i = 0; i < size; i += n) {
            for (int j = i; j < i + n; j++) {
                for (int k = i; k < i + n; k++) {
                    squareSum += array[j][k];
                }
            }
            if (squareSum == sum) {
                squareSum = 0;
            } else {
                isSolved = false;
                break;
            }
        }

        if (isSolved) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}