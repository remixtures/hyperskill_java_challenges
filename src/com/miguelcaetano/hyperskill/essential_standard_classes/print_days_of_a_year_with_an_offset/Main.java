package com.miguelcaetano.hyperskill.essential_standard_classes.print_days_of_a_year_with_an_offset;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dateStr = input.nextLine();
        String[] dates = dateStr.split("-");
        int year = Integer.parseInt(dates[0]);
        int nextYear = year + 1;
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        int days = input.nextInt();

        LocalDate startDate = LocalDate.of(year, month, day);
        LocalDate endDate = LocalDate.of(nextYear, 1, 1);
        for (int i = 0; i < days; i++) {
            if (!startDate.isBefore(endDate)) {
                break;
            }
            System.out.println(startDate);
            startDate = startDate.plusDays(days);
        }
    }
}