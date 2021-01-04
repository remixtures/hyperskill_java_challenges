package com.miguelcaetano.hyperskill.basic_syntax.alternating_fibonacci_numbers;

import java.util.Scanner;

/* RECURSION

Given the small integer n you need to find the n-th number of the alternating Fibonacci sequence.

The sequence starts with 0, 1, -1, 2, -3, 5, -8, 13, -21, ...

So, fib(0) = 0, fib(1) = 1; fib(2) = -1.

Think of the recurrence relation and implement the method named fib in a recursive way.

It's not efficient in the general but works well for small n.

Sample Input:
2

Sample Output:
-1

Sample Input:
3

Sample Output:
2

 */

public class Main {

    public static long fib(long n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 2) - fib(n - 1);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}
