package com.miguelcaetano.hyperskill.collections.sherlock_holmes_and_the_removing_of_characters;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstWord = sc.nextLine().toLowerCase();
        String secondWord = sc.nextLine().toLowerCase();

        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();

        for (char letter : firstWord.toCharArray()) {
            if (firstMap.containsKey(letter)) {
                firstMap.put(letter, firstMap.get(letter) + 1);
            } else {
                firstMap.put(letter, 1);
            }
        }

        for (char letter : secondWord.toCharArray()) {
            if (secondMap.containsKey(letter)) {
                secondMap.put(letter, secondMap.get(letter) + 1);
            } else {
                secondMap.put(letter, 1);
            }
        }

        Set<Character> firstSet = firstMap.keySet();
        Set<Character> secondSet = secondMap.keySet();

        Set<Character> finalSet = new HashSet<>(firstSet);
        finalSet.addAll(secondSet);

        int sum = 0;
        for (Character letter : finalSet) {
            int x = firstMap.getOrDefault(letter, 0);
            int y = secondMap.getOrDefault(letter, 0);
            sum += x > y ? x - y : y - x;
        }

        System.out.println(sum);
    }
}