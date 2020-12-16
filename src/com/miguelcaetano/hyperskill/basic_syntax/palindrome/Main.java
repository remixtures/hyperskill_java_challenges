package com.miguelcaetano.hyperskill.basic_syntax.palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String palindrome = "yes";

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                palindrome = "no";
            }
        }
        System.out.println(palindrome);
    }
}
