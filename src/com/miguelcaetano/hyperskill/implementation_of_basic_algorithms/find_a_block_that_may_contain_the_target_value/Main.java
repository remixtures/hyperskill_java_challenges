package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.find_a_block_that_may_contain_the_target_value;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int[] numberArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numberArray[i] = input.nextInt();
        }
        int targetValue = input.nextInt();

        System.out.println(jumpSearch(numberArray, targetValue));
    }

    public static String jumpSearch(int[] numberArray, int targetValue) {
        int currentRight = 0;
        int prev = 0;

        if (numberArray.length == 0) {
            return "-1";
        }

        int jumpLength = (int) Math.sqrt(numberArray.length);

        while (currentRight < numberArray.length - 1) {

            currentRight = Math.min(numberArray.length, prev + jumpLength) - 1;

            if (numberArray[currentRight] >= targetValue) {
                break;
            }
            prev = currentRight + 1;
        }

        if (currentRight == numberArray.length - 1 && targetValue > numberArray[currentRight]) {
            return "-1";
        }

        return prev + " " + currentRight;
    }
}
