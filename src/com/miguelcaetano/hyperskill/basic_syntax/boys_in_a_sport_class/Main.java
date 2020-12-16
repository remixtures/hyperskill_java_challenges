package com.miguelcaetano.hyperskill.basic_syntax.boys_in_a_sport_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        if (first <= second && second <= third || first >= second && second >= third) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
