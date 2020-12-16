package com.miguelcaetano.hyperskill.collections.output_elements;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        nameSet.forEach(System.out::println);
    }
}
