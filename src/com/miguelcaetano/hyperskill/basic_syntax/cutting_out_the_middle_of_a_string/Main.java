package com.miguelcaetano.hyperskill.basic_syntax.cutting_out_the_middle_of_a_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            newWord.append(word.charAt(i));
        }
        if (word.length() % 2 == 0) {
            newWord.deleteCharAt(word.length() / 2);
            newWord.deleteCharAt(word.length() / 2 - 1);
        } else if (word.length() % 2 != 0) {
            newWord.deleteCharAt(word.length() / 2);
        }

        System.out.println(newWord.toString());
    }
}
