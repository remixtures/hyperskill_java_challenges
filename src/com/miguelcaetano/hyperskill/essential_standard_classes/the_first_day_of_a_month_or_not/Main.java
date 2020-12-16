package com.miguelcaetano.hyperskill.essential_standard_classes.the_first_day_of_a_month_or_not;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        LocalDate date = LocalDate.ofYearDay(year, input.nextInt());
        if (date.getDayOfMonth() == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
