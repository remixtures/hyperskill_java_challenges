package com.miguelcaetano.hyperskill.basic_syntax.squares_of_natural_numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = 1;
        int power = 0;
        do {
            power = (int) Math.pow(counter, 2);
            if (power <= number) {
                System.out.println(power);
            }
            counter++;
        } while (power <= number);
    }
}
