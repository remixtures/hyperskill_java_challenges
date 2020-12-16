package com.miguelcaetano.hyperskill.basic_syntax.next_even_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b;
        int c;
        int x = scan.nextInt();

        if (x % 2 == 0) {
            b = x + 2;
            System.out.println(b);
        } else {
            c = x + 1;
            System.out.println(c);
        }
    }
}

