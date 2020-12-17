package com.miguelcaetano.hyperskill.regular_expressions.number_parsing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[+-]?(0+|[1-9]\\d*|(0+|[1-9]\\d*)[.,](0|\\d*[1-9]))$";

        String number = scanner.nextLine();
        System.out.println(number.matches(regex) ? "YES" : "NO");
    }
}
