package com.miguelcaetano.hyperskill.basic_syntax.initializing_an_array_of_integers;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers; // initialize the array
        numbers = new int[]{12, 17, 8, 101, 33};
        System.out.println(Arrays.toString(numbers));
    }
}
