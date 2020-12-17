package com.miguelcaetano.hyperskill.regular_expressions.vehicle_registration_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number

        boolean regexMatch = regNum.matches("[ABEKMHOPCTYX]\\d{3}[ABEKMHOPCTYX]{2}");

        System.out.println(regexMatch);
    }
}
