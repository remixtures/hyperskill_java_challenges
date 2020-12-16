package com.miguelcaetano.hyperskill.object_oriented_programming.preparing_full_name;

import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName) {
        if (firstName == null) {
            return lastName;
        }

        if (lastName == null) {
            return firstName;
        }
        return firstName + " " + lastName;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}