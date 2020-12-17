package com.miguelcaetano.hyperskill.collections.modifying_a_map;

import java.util.*;

class MapUtils {

    public static void mapShare(Map<String, String> map) {
        if (map.get("a") != null) {
            map.remove("c");
            map.put("b", map.get("a"));
        } else {
            map.remove("c");
        }
    }
}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] pair = s.split(":");
            map.put(pair[0], pair[1]);
        }
        MapUtils.mapShare(map);
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}