package com.miguelcaetano.hyperskill.collections.tricky_submaps;

import java.util.*;

class MapUtils {
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {
        TreeMap<Integer, String> reversedMap = new TreeMap<>(Collections.reverseOrder());
        reversedMap.putAll(map);
        return map.firstKey() % 2 != 0 ? //check not reversed Map
                reversedMap.subMap(map.firstKey() + 4, map.firstKey() - 1) :
                reversedMap.subMap(map.lastKey(), map.lastKey() - 5);
    }
}

/* Do not modify code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });

        Map<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}