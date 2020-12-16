package com.miguelcaetano.hyperskill.basic_syntax.double_characters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char[] letter = word.toCharArray();
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            newWord.append(letter[i]);
            newWord.append(letter[i]);
        }
        System.out.println(newWord.toString());
    }
}
