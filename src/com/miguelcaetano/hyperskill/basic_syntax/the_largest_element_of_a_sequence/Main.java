package com.miguelcaetano.hyperskill.basic_syntax.the_largest_element_of_a_sequence;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        while (input.hasNext()) {
            int number = input.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
