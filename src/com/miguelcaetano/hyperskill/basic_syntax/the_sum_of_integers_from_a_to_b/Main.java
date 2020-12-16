package com.miguelcaetano.hyperskill.basic_syntax.the_sum_of_integers_from_a_to_b;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}