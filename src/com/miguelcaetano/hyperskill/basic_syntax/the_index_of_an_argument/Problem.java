package com.miguelcaetano.hyperskill.basic_syntax.the_index_of_an_argument;

public class Problem {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
