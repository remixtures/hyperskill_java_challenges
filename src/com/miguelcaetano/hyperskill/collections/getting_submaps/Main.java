package com.miguelcaetano.hyperskill.collections.getting_submaps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minRange = scanner.nextInt();
        int maxRange = scanner.nextInt();
        int size = scanner.nextInt();
        Map<Integer, String> counter = new HashMap<>(size);
        for (int i = 0; i < size; i++) {
            counter.put(scanner.nextInt(), scanner.next());
        }

        for (int i = minRange; i <= maxRange; i++) {
            if (counter.containsKey(i)) {
                System.out.println(i + " " + counter.get(i));
            }
        }
    }
}
