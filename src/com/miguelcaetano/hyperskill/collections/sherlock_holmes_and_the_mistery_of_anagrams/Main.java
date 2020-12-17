package com.miguelcaetano.hyperskill.collections.sherlock_holmes_and_the_mistery_of_anagrams;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord = input.nextLine();
        String secondWord = input.nextLine();

        if (firstWord.length() == secondWord.length()) {
            checkAnagram(firstWord, secondWord);
        } else {
            System.out.println("no");
        }

        input.close();
    }

    static void checkAnagram(String firstWord, String secondWord) {
        char[] firstChars = firstWord.toLowerCase().toCharArray();
        char[] secondChars = secondWord.toLowerCase().toCharArray();

        boolean flag = true;
        int count;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < firstChars.length; ++i) {
            count = 0;

            if (hashMap.containsKey(firstChars[i])) {
                count = hashMap.get(firstChars[i]);
            }

            hashMap.put(firstChars[i], ++count);

            count = 0;

            if (hashMap.containsKey(secondChars[i])) {
                count = hashMap.get(secondChars[i]);
            }

            hashMap.put(secondChars[i], --count);
        }

        for (int value : hashMap.values()) {
            if (value != 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
