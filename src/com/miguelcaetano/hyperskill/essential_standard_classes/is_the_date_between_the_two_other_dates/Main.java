package com.miguelcaetano.hyperskill.essential_standard_classes.is_the_date_between_the_two_other_dates;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] datesArray = input.nextLine().split(" ");
        LocalDate dateToCheck = LocalDate.parse(datesArray[0]);
        LocalDate firstDate = LocalDate.parse(datesArray[1]);
        LocalDate secondDate = LocalDate.parse(datesArray[2]);
        boolean isInRange = false;
        if (!dateToCheck.isEqual(firstDate) && !dateToCheck.isEqual(secondDate)) {
            if (firstDate.isBefore(secondDate)) {
                if (dateToCheck.isAfter(firstDate) && dateToCheck.isBefore(secondDate)) {
                    isInRange = true;
                }
            } else if (secondDate.isBefore(firstDate) && dateToCheck.isAfter(secondDate)
                    && dateToCheck.isBefore(firstDate)) {
                isInRange = true;
            }
        }
        System.out.println(isInRange);
    }
}
