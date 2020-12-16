package com.miguelcaetano.hyperskill.basic_syntax.calculator_with_four_methods;

// Don't delete this import statement
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long firstNumber = input.nextLong();
        String operator = input.next();
        long secondNumber = input.nextLong();

        switch (operator) {
            case "-":
                subtractTwoNumbers(firstNumber, secondNumber);
                break;
            case "+":
                sumTwoNumbers(firstNumber, secondNumber);
                break;
            case "/":
                divideTwoNumbers(firstNumber, secondNumber);
                break;
            case "*":
                multiplyTwoNumbers(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Please provide a valid operator");
                break;
        }
    }

    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
        System.out.println(a - b);
    }

    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
    }

    public static void divideTwoNumbers(long a, long b) {
        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Division by 0!");
        }
    }

    public static void multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
    }
}