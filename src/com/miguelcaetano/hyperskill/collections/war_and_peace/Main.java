package com.miguelcaetano.hyperskill.collections.war_and_peace;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().toLowerCase().split(" ");
        Map<String, Integer> countWords = new TreeMap<>();
        for (String word : words) {
            Integer oldCount = countWords.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            countWords.put(word, oldCount + 1);
        }

        for (Map.Entry<String, Integer> word : countWords.entrySet()) {
            System.out.println(word.getKey() + " " + word.getValue());
        }
    }
}
