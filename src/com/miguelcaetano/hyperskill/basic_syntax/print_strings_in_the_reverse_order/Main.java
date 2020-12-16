package com.miguelcaetano.hyperskill.basic_syntax.print_strings_in_the_reverse_order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner input = new Scanner(System.in);
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();
        System.out.println(wordThree);
        System.out.println(wordTwo);
        System.out.println(wordOne);
        input.close();
    }
}