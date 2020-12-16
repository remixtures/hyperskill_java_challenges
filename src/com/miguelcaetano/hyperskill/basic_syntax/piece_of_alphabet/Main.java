package com.miguelcaetano.hyperskill.basic_syntax.piece_of_alphabet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newStr = input.nextLine();
        String alphabet = "abcdefghijklmopqrstuvwxyz";
        System.out.println(alphabet.contains(newStr));
    }
}
