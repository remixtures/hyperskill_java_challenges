package com.miguelcaetano.hyperskill.object_oriented_programming.hidden_enumeration;

public class Main {

    public static void main(String[] args) {
        // write your program here
        int countStar = 0;
        for (Secret element : Secret.values()) {
            if (element.name().contains("STAR")) {
                countStar++;
            }
        }
        System.out.println(countStar);
    }
}

enum Secret {
    STAR, CRASH, START
}
