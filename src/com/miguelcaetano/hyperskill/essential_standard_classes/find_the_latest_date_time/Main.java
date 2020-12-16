package com.miguelcaetano.hyperskill.essential_standard_classes.find_the_latest_date_time;

import java.time.*;
import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        TreeSet<LocalDateTime> setOfDates = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            input.nextLine();
            input.findInLine("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d).(\\d\\d):(\\d\\d)");
            try {
                MatchResult mr = input.match();
                int year = Integer.parseInt(mr.group(1));
                int month = Integer.parseInt(mr.group(2));
                int day = Integer.parseInt(mr.group(3));
                int hour = Integer.parseInt(mr.group(4));
                int minute = Integer.parseInt(mr.group(5));
                LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, minute);
                setOfDates.add(dateTime);
            } catch (IllegalStateException e) {
                System.err.println("Invalid date-time format.");
            }
        }
        System.out.println(setOfDates.last());
    }
}
