package com.miguelcaetano.hyperskill.basic_syntax.symmetrical_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.next();
        char a = number.charAt(0);
        char b = number.charAt(1);
        char c = number.charAt(2);
        char d = number.charAt(3);
        if (a == d && b == c) {
            System.out.println(1);
        } else {
            System.out.println(a + d);
        }
    }
}
