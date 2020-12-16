package com.miguelcaetano.hyperskill.basic_syntax.size_of_parts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            if (array[i] == 1) {
                larger++;
            } else if (array[i] == -1) {
                smaller++;
            } else if (array[i] == 0) {
                perfect++;
            }
        }
        System.out.print(perfect + " " + larger + " " + smaller);
    }
}
