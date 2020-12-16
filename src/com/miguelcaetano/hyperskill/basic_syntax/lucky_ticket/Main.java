package com.miguelcaetano.hyperskill.basic_syntax.lucky_ticket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        String first = ("" + number).substring(0, 3);
        String second = ("" + number).substring(3, 6);
        int firstSum = 0;
        int secondSum = 0;

        for (int x = 0; x < first.length(); x++) {
            firstSum += Character.getNumericValue(first.charAt(x));
        }
        for (int x = 0; x < second.length(); x++) {
            secondSum += Character.getNumericValue(second.charAt(x));
        }
        if (firstSum == secondSum) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}