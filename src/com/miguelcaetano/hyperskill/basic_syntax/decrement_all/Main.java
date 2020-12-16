package com.miguelcaetano.hyperskill.basic_syntax.decrement_all;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int oneDecrement = --one;
        int two = scanner.nextInt();
        int twoDecrement = --two;
        int three = scanner.nextInt();
        int threeDecrement = --three;
        int four = scanner.nextInt();
        int fourDecrement = --four;
        System.out.println(oneDecrement + " " + twoDecrement + " " + threeDecrement + " " + fourDecrement);

    }
}
