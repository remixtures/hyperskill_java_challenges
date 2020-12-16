package com.miguelcaetano.hyperskill.essential_standard_classes.the_nth_day_from_the_end_of_a_month;

import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int month = input.nextInt();
        int offsetDays = input.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate newDate = date.plusMonths(1).minusDays(offsetDays);
        System.out.println(newDate);
    }
}
