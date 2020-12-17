package com.miguelcaetano.hyperskill.collections.no_j;

import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        List<String> listOfStrings = new ArrayList<>(Arrays.asList(array));
        ListIterator<String> iterator = listOfStrings.listIterator();
        List<String> reversedList = new ArrayList<>();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.charAt(0) == 'J') {
                reversedList.add(word.substring(1));
            }
        }
        Collections.reverse(reversedList);

        for (String string : reversedList) {
            System.out.println(string);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}
