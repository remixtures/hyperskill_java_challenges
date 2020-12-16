package com.miguelcaetano.hyperskill.essential_standard_classes.thirty_years_before_and_after;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dateString = input.nextLine();
        LocalDate date = LocalDate.parse(dateString);
        System.out.println(date.minusYears(30));
        System.out.println(date.plusYears(30));

    }
}