package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.the_number_of_required_shifts;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbersArray = new int[size];
        for (int i = 0; i < size; i++) {
            numbersArray[i] = input.nextInt();
        }
        System.out.println(numberOfShifts(numbersArray));
    }

    public static int numberOfShifts(int[] numbersArray) {
        int countNumberOfShifts = 0;
        for (int i = 1; i < numbersArray.length; i++) {
            int elem = numbersArray[i];
            int j = i - 1;
            while (j >= 0 && numbersArray[j] < elem) {
                numbersArray[j + 1] = numbersArray[j];
                j--;
            }

            if (j + 1 != i) {
                countNumberOfShifts++;
            }

            numbersArray[j + 1] = elem;
        }
        return countNumberOfShifts;
    }
}