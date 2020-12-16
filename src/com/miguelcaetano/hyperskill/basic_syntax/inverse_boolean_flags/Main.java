package com.miguelcaetano.hyperskill.basic_syntax.inverse_boolean_flags;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void inverseFlags(boolean[] flags) {
        for (int i = 0; i < flags.length; i++) {
            flags[i] = !(flags[i]);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Boolean> booleans = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Boolean::parseBoolean)
                .collect(Collectors.toList());
        final boolean[] flags = new boolean[booleans.size()];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = booleans.get(i);
        }
        inverseFlags(flags);
        final String representation = Arrays.toString(flags)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        System.out.println(representation);
    }
}