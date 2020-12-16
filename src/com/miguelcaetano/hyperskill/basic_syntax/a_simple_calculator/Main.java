package com.miguelcaetano.hyperskill.basic_syntax.a_simple_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long result = 0;
        long one = scanner.nextLong();
        char operator = scanner.next().charAt(0);
        long two = scanner.nextLong();
        switch (operator) {
            case '+':
                result = one + two;
                System.out.println(result);
                break;
            case '-':
                result = one - two;
                System.out.println(result);
                break;
            case '*':
                result = one * two;
                System.out.println(result);
                break;
            case '/':
                if (two == 0) {
                    System.out.println("Division by 0!");
                    break;
                } else {
                    result = one / two;
                    System.out.println(result);
                    break;
                }
            default:
                if (operator != '+' || operator != '-' || operator != '/' || operator != '*') {
                    System.out.println("Unknown operator");
                }
                break;
        }
    }
}
