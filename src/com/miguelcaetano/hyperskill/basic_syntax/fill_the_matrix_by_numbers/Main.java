package com.miguelcaetano.hyperskill.basic_syntax.fill_the_matrix_by_numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int[][] twoDimArray = new int[n][n];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = Math.abs(i - j);
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
