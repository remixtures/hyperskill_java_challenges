package com.miguelcaetano.hyperskill.basic_syntax.advanced_calculator;

/* COMMAND-LINE ARGUMENTS:

Write a program that takes an operator ("MAX", "MIN", "SUM") and a sequence of numbers as the command-line arguments
and then outputs the result of the operator in the standard output.

The description of the operators:
    - "MAX" finds the max value of a sequence of numbers;
    - "MIN" find the min value of a sequence of numbers;
    - "SUM" calculates the sum of a sequence of numbers.

It is guaranteed that a correct operator and at least one number will be passed to the program.

Please, do not rename the provided class Problem.

Sample Input:
MAX 7 3 4 1 8 11 3 2

Sample Output:
11

 */

class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 1; i < args.length; i++) {
            int next = Integer.valueOf(args[i]);
            if (next > max) {
                max = next;
            }
            if (next < min) {
                min = next;
            }
            sum += next;
        }

        switch (operator) {
            case "MAX":
                System.out.println(max);
                break;
            case "MIN":
                System.out.println(min);
                break;
            case "SUM":
                System.out.println(sum);
                break;
            default:
                break;
        }
    }
}
