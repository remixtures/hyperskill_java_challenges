package com.miguelcaetano.hyperskill.basic_syntax.exactly_one_parameter_is_positive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        boolean onlyFirstIsPositive = one > 0 && two <= 0 && three <= 0;
        boolean onlySecondIsPositive = one <= 0 && two > 0 && three <= 0;
        boolean onlyThirdIsPositive = one <= 0 && two <= 0 && three > 0;

        boolean exactlyOneIsPositive =
                onlyFirstIsPositive ||
                        onlySecondIsPositive ||
                        onlyThirdIsPositive;

        System.out.println(exactlyOneIsPositive);

    }
}
