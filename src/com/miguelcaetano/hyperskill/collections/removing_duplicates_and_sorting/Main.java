package com.miguelcaetano.hyperskill.collections.removing_duplicates_and_sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();
        int lines;
        SortedSet<String> setOfStrings = new TreeSet<>();
        for (lines = 0; lines <= numberOfLines; lines++) {
            setOfStrings.add(input.nextLine());
        }
        for (String value : setOfStrings) {
            System.out.println(value);
        }
    }
}
