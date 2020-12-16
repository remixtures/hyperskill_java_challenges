package com.miguelcaetano.hyperskill.basic_syntax.the_longest_word;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String givenString = input.nextLine();
        String[] words = givenString.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(longestWord);
    }
}
