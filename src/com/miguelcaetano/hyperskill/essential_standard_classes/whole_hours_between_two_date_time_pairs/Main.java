package com.miguelcaetano.hyperskill.essential_standard_classes.whole_hours_between_two_date_time_pairs;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime fromDateTime = LocalDateTime.parse(input.nextLine());
        LocalDateTime toDateTime = LocalDateTime.parse(input.nextLine());
        long hours = ChronoUnit.HOURS.between(fromDateTime, toDateTime);
        System.out.println(hours);
    }
}
