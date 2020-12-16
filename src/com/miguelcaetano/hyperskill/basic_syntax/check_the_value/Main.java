package com.miguelcaetano.hyperskill.basic_syntax.check_the_value;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int five = scanner.nextInt();
        System.out.println(five < 10);
    }
}

