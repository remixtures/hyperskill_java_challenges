package com.miguelcaetano.hyperskill.basic_syntax.area_of_parallelogram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // call the method here
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();

        countAreaOfParallelogram(base, height);
    }

    // Do not change code below
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}