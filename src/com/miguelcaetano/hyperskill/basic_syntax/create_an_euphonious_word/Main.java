package com.miguelcaetano.hyperskill.basic_syntax.create_an_euphonious_word;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vowels = "a, e, i, o, u, y";
        String[] word = scan.nextLine().split("");
        int count = 0;
        int i = 0;
        while (i < word.length - 2) {
            if (vowels.contains(word[i]) && vowels.contains(word[i + 1]) && vowels.contains(word[i + 2])) {
                count++;
                i++;
            } else if (!vowels.contains(word[i]) && !vowels.contains(word[i + 1]) && !vowels.contains(word[i + 2])) {
                count++;
                i++;
            }
            i++;
        }
        System.out.println(count);
    }
}
