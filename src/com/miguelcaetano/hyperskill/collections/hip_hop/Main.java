package com.miguelcaetano.hyperskill.collections.hip_hop;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void iterateOverList(ListIterator<String> iter) {
        while (iter.hasNext()) {
            String hipHop = iter.next();
            if ("Hip".equals(hipHop)) {
                iter.add("Hop");
            }
        }
    }

    public static void printList(ListIterator<String> iter) {
        for (ListIterator<String> it = iter; it.hasNext();) {
            String word = it.next();
            System.out.println(word);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        iterateOverList(list.listIterator());
        printList(list.listIterator());
    }
}

