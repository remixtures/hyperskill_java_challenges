package com.miguelcaetano.hyperskill.basic_syntax.check_prefix_ignoring_the_case;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.print(word.toLowerCase().charAt(0) == 'j');
    }
}
