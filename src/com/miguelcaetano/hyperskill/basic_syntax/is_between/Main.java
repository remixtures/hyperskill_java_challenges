package com.miguelcaetano.hyperskill.basic_syntax.is_between;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        System.out.println(three <= one && one <= two || one <= two && one >= three || three >= one && one >= two);
    }
}
