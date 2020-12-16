package com.miguelcaetano.hyperskill.basic_syntax.the_count_of_numbers_divisible_by_n;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int firstDivisible = a % n == 0 ? a : a + (n - a % n);
        int lastDivisible = b % n == 0 ? b : b - b % n;
        int solution = (lastDivisible - firstDivisible) / n + 1;
        System.out.println(solution);
    }
}
