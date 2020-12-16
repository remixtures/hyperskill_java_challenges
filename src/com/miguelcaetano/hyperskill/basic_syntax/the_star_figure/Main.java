package com.miguelcaetano.hyperskill.basic_syntax.the_star_figure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        char[][] star = new char[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                star[row][cell] = '.';
            }
        }
        for (int cell = 0; cell < size; cell++) {
            star[size / 2][cell] = '*';
            star[cell][size / 2] = '*';
        }
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                if (row + cell == size - 1 || row == cell) {
                    star[row][cell] = '*';
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(star[i][j] + " ");
            }
            System.out.println();
        }
    }
}
