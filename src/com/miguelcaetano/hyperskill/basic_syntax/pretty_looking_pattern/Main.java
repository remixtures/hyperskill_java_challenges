package com.miguelcaetano.hyperskill.basic_syntax.pretty_looking_pattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] symbols = new char[4][4];
        for (int i = 0; i < 4; i++) {
            symbols[i] = input.next().toCharArray();
        }
        boolean looksPretty = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (symbols[i][j] == symbols[i + 1][j + 1] &&
                        symbols[i][j]  == symbols[i][j + 1] &&
                        symbols[i][j]  == symbols[i + 1][j]) {
                    looksPretty = false;
                    break;
                }
            }
        }
        System.out.println(looksPretty ? "YES" : "NO");
    }
}