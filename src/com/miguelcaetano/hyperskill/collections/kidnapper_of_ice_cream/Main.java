package com.miguelcaetano.hyperskill.collections.kidnapper_of_ice_cream;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] availableWords = input.nextLine().split("\\s+");
        String[] myNote = input.nextLine().split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : availableWords) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (String word : myNote) {
            if (!map.containsKey(word) || map.get(word) == 0) {
                System.out.println("You are busted");
                return;
            } else {
                map.put(word, map.get(word) - 1);
            }
        }
        System.out.println("You get money");
    }
}
