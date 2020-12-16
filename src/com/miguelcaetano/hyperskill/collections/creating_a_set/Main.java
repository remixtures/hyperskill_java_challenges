package com.miguelcaetano.hyperskill.collections.creating_a_set;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Set<String> set = new TreeSet<>(Set.of("Gamma", "Alpha", "Omega"));
        System.out.println(set);
    }
}