package com.miguelcaetano.hyperskill.basic_syntax.the_integer_barrier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        while (true) {
            number = input.nextInt();
            sum += number;
            if (number == 0) {
                System.out.println(sum);
                break;
            }
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}
