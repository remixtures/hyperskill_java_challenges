package com.miguelcaetano.hyperskill.collections.frequency_of_characters;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Object::toString).collect(Collectors.toList());

        String letter = scanner.nextLine();
        int frequency = Collections.frequency(stringList, letter);
        System.out.println(frequency);    }
}