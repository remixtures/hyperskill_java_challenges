package com.miguelcaetano.hyperskill.essential_standard_classes.the_passed_hours_since_the_beginning_of_the_year;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime presentTime = LocalDateTime.parse(input.nextLine());
        LocalDateTime begginingOfTheYear = LocalDateTime.parse("2017-01-01T00:00:00");
        long hours = ChronoUnit.HOURS.between(begginingOfTheYear, presentTime);
        System.out.println(hours);
    }
}
