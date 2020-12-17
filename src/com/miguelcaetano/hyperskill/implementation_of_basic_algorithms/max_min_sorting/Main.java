package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.max_min_sorting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbersArray = new int[size];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = input.nextInt();
        }

        maxMinSorting(numbersArray);
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }
    }

    private static int[] maxMinSorting(int[] numbersArray) {

        boolean forMax = true;
        for (int i = 0; i < numbersArray.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (forMax ? numbersArray[index] < numbersArray[j] : numbersArray[index] > numbersArray[j]) {
                    index = j;
                }
            }
            forMax = !forMax;
            int temp = numbersArray[index];
            numbersArray[index] = numbersArray[i];
            numbersArray[i] = temp;

        }
        return numbersArray;
    }
}
