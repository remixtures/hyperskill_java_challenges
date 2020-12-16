package com.miguelcaetano.hyperskill.collections.spell_checker;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        Set<String> dictionary = new HashSet<>();
        for (int lines = 0; lines <= numberOfLines; lines++) {
            dictionary.add(scanner.nextLine().toLowerCase());
        }

        int numberOfWords = scanner.nextInt();
        Set<String> stringList = new LinkedHashSet<>();

        for (int line = 0; line <= numberOfWords; line++) {
            String words = scanner.nextLine().toLowerCase();
            for (String word : words.split(" ")) {
                if (!dictionary.contains(word)) {
                    stringList.add(word);
                }
            }
        }

        for (String values : stringList) {
            System.out.println(values);
        }
    }
}
