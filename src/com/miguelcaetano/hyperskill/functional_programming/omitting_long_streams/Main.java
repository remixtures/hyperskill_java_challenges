package com.miguelcaetano.hyperskill.functional_programming.omitting_long_streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.*;

public class Main {

    private static Stream<String> omitLongStrings(List<String> strings) {
        // write your code here
        return strings.stream().filter(word -> word.length() <= 3);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        omitLongStrings(list).forEach(System.out::println);
    }
}
