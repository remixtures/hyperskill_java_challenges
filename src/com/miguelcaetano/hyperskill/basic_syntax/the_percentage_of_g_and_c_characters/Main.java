package com.miguelcaetano.hyperskill.basic_syntax.the_percentage_of_g_and_c_characters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == 'c' || word.toLowerCase().charAt(i) == 'g') {
                count++;
            }
        }
        System.out.println((double) count / word.length() * 100);
    }
}
