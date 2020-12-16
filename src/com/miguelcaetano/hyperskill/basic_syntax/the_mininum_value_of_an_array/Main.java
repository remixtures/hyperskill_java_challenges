package com.miguelcaetano.hyperskill.basic_syntax.the_mininum_value_of_an_array;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        System.out.println(array[0]);

    }
}
