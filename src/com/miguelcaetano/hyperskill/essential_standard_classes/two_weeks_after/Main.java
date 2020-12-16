package com.miguelcaetano.hyperskill.essential_standard_classes.two_weeks_after;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String currentDate = input.nextLine();
        LocalDate dataActual = LocalDate.parse(currentDate);
        LocalDate twoWeeksLater = dataActual.plusDays(14);
        System.out.println(twoWeeksLater);
    }
}
