package com.miguelcaetano.hyperskill.basic_syntax.number_of_occurrences;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String firstString = " " + input.nextLine() + " ";
        String secondString = input.nextLine();

        String[] parts = firstString.split(secondString);
        System.out.println(parts.length - 1);
    }
}
