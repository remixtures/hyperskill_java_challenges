package com.miguelcaetano.hyperskill.basic_syntax.find_the_max_of_three_numbers;

import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int firstMax = Math.max(a, b);
        int highMax = Math.max(firstMax, c);
        int index = 0;
        if (a == highMax) {
            index = 1;
        } else if (b == highMax) {
            index = 2;
        } else {
            index = 3;
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}