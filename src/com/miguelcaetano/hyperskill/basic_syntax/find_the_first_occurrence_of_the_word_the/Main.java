package com.miguelcaetano.hyperskill.basic_syntax.find_the_first_occurrence_of_the_word_the;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase();
        System.out.println(sentence.indexOf("the"));
    }
}