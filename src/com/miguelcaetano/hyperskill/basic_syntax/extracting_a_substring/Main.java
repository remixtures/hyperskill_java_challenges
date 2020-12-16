package com.miguelcaetano.hyperskill.basic_syntax.extracting_a_substring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int beginning = input.nextInt();
        int end = input.nextInt();
        System.out.println(name.substring(beginning, end + 1));
    }
}
