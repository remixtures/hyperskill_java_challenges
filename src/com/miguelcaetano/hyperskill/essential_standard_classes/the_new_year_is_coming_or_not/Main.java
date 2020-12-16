package com.miguelcaetano.hyperskill.essential_standard_classes.the_new_year_is_coming_or_not;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] date = input.nextLine().split(" ");
        LocalDate presentDate = LocalDate.parse(date[0]);
        LocalDate futureDate = presentDate.plusDays(Integer.parseInt(date[1]));
        LocalDate nextYear = presentDate.plusYears(1);
        if (futureDate.getYear() == nextYear.getYear()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}