package com.miguelcaetano.hyperskill.collections.creating_a_map;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Alpha", 1);
        map.put("Gamma", 3);
        map.put("Omega", 24);
        System.out.println(map);
    }
}
