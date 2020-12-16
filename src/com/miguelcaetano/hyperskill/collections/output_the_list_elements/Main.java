package com.miguelcaetano.hyperskill.collections.output_the_list_elements;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
