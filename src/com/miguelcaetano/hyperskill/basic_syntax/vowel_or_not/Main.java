package com.miguelcaetano.hyperskill.basic_syntax.vowel_or_not;

import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        boolean vowelOrNot = false;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < vowels.length(); i++) {
            if (ch == vowels.charAt(i)) {
                vowelOrNot = true;
                break;
            }
        }
        return vowelOrNot;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}