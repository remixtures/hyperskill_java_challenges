package com.miguelcaetano.hyperskill.basic_syntax.check_a_number_is_positive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}