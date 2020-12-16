package com.miguelcaetano.hyperskill.collections.initialize_a_collection;

import java.util.ArrayList;

public class Main {
    ArrayList<String> list = new ArrayList<>();

    void init() {
        // add "one", "two", "three" to list field in this order
        list.add("one");
        list.add("two");
        list.add("three");
    }
}

class Test {
    public static void main(String[] args) {
        Main main = new Main();
        main.init();

        for (String str : main.list) {
            System.out.println(str);
        }
    }
}