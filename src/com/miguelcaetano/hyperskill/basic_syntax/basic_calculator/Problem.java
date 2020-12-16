package com.miguelcaetano.hyperskill.basic_syntax.basic_calculator;

public class Problem {

    public static void main(String[] args) {
        char operator = args[0].charAt(0);
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
