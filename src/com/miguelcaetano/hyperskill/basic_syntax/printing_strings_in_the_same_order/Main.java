package com.miguelcaetano.hyperskill.basic_syntax.printing_strings_in_the_same_order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String firstWord = input.next();
        String secondWord = input.next();
        input.nextLine();
        String firstLine = input.nextLine();
        System.out.println(firstWord);
        System.out.println(secondWord);
        String[] dividingTheLine = firstLine.split(" ");
        for (String word : dividingTheLine) {
            System.out.println(word);
        }
        input.close();
    }
}
