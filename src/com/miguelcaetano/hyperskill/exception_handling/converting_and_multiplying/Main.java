package com.miguelcaetano.hyperskill.exception_handling.converting_and_multiplying;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String test;
        int number;
        while (scan.hasNext()) {
            test = scan.nextLine();
            try {
                number = Integer.parseInt(test) * 10;
                if (number == 0) {
                    break;
                }
                System.out.println(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + test);
            }
        }
    }
}
