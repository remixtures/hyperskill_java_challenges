package com.miguelcaetano.hyperskill.basic_syntax.the_unordered_sequence;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber;
        Boolean isAscending = true;
        Boolean isDescending = true;

        while ((secondNumber = input.nextInt()) != 0) {

            if (secondNumber > firstNumber) {
                isDescending = false;
            } else if (secondNumber < firstNumber) {
                isAscending = false;
            }
            firstNumber = secondNumber;
        }

        System.out.println(isAscending || isDescending);
    }
}
