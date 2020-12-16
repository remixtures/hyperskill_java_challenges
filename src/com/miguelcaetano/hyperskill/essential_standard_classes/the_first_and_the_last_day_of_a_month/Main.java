package com.miguelcaetano.hyperskill.essential_standard_classes.the_first_and_the_last_day_of_a_month;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int month = input.nextInt();
        LocalDate firstDayofMonth = LocalDate.of(year, month, 1);
        LocalDate lastDayofMonth = firstDayofMonth.withDayOfMonth(firstDayofMonth.lengthOfMonth());

        System.out.println(firstDayofMonth + " " + lastDayofMonth);
    }
}
