package com.miguelcaetano.hyperskill.basic_syntax.replacing_a_with_b;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(word.replace("a", "b"));

    }
}
