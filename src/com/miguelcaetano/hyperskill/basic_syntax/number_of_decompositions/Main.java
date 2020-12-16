package com.miguelcaetano.hyperskill.basic_syntax.number_of_decompositions;

import java.util.*;

public class Main {

    public static void decomposition(int target) {
        decomposition(target, target, "");
    }
    public static void decomposition(int target, int maxValue, String prefix) {
        if (target == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 1; i <= Math.min(maxValue, target); i++) {
            decomposition(target - i, i, prefix + " " + i);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        decomposition(target);
    }
}