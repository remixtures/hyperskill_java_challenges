package com.miguelcaetano.hyperskill.basic_syntax.the_sum_of_elements;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        do {
            number = input.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println(sum);
    }
}
