package com.miguelcaetano.hyperskill.basic_syntax.check_the_sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.next());
        int b = Integer.valueOf(scanner.next());
        int c = Integer.valueOf(scanner.next());

        if (a + b == 20 || a + c == 20 || b + c == 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
