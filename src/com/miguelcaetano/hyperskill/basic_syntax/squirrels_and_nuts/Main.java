package com.miguelcaetano.hyperskill.basic_syntax.squirrels_and_nuts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();
        int nutsLeft = nuts % squirrels;
        System.out.println(nutsLeft);
    }
}