package com.miguelcaetano.hyperskill.exception_handling.avoid_division_by_zero;

import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int bPlusc = b + c;

        if (d == 0 || bPlusc == 0 || d > (b + c)) {
            System.out.println("Division by zero!");
        } else {
            int result = a / ((b + c) / d);
            System.out.println(result);
        }
    }
}
