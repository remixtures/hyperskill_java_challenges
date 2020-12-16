package com.miguelcaetano.hyperskill.basic_syntax.count_how_many_times_a_number_occurs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int n = input.nextInt();
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (n == array[i]) {
                listOfNumbers.add(array[i]);
            }
        }
        System.out.println(listOfNumbers.size());
    }
}

