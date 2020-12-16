package com.miguelcaetano.hyperskill.basic_syntax.check_the_value_ii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number > 0 && number < 10);
        // put your code here
    }
}

