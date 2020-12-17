package com.miguelcaetano.hyperskill.collections.counting_words;

import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> wordCounter = new TreeMap<>();
        for (String letter : strings) {
            if (wordCounter.containsKey(letter)) {
                wordCounter.put(letter, wordCounter.get(letter) + 1);
            } else {
                wordCounter.putIfAbsent(letter, 1);
            }
        }
        return wordCounter;
    }

    public static void printMap(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}