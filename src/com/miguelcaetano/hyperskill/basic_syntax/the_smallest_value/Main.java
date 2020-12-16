package com.miguelcaetano.hyperskill.basic_syntax.the_smallest_value;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long m = input.nextLong();
        long n = 1;
        long count = 1;
        while (n <= m) {
            count++;
            n = n * count;
        }

        System.out.println(count);
    }
}
