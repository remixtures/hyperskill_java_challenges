package com.miguelcaetano.hyperskill.basic_syntax.the_sequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxNumber = 0;
        while (input.hasNext()) {
            int number = input.nextInt();
            if (number % 4 == 0 && number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println(maxNumber);
    }
}
