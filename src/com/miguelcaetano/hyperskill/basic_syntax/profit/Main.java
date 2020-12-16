package com.miguelcaetano.hyperskill.basic_syntax.profit;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();

        int now = 0;
        while (k > m) {
            m = m + m * p / 100;
            now++;
        }
        System.out.println(now);
    }
}