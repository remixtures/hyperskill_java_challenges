package com.miguelcaetano.hyperskill.essential_standard_classes.merging_date_time_instances;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        int year = dateTime1.getYear() > dateTime2.getYear() ?
                dateTime1.getYear() : dateTime2.getYear();

        int month = dateTime1.getMonthValue() > dateTime2.getMonthValue() ?
                dateTime1.getMonthValue() : dateTime2.getMonthValue();

        int day = dateTime1.getDayOfMonth() > dateTime2.getDayOfMonth() ?
                dateTime1.getDayOfMonth() : dateTime2.getDayOfMonth();

        int hour = dateTime1.getHour() > dateTime2.getHour() ?
                dateTime1.getHour() : dateTime2.getHour();

        int minute = dateTime1.getMinute() > dateTime2.getMinute() ?
                dateTime1.getMinute() : dateTime2.getMinute();

        int second = dateTime1.getSecond() > dateTime2.getSecond() ?
                dateTime1.getSecond() : dateTime2.getSecond();

        return LocalDateTime.of(year, month, day, hour, minute, second);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}
