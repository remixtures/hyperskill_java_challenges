package com.miguelcaetano.hyperskill.essential_standard_classes.the_intersection_of_time_ranges;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TimeRange firstTimeRange = TimeRange.between(LocalTime.parse(input.next()), LocalTime.parse(input.next()));
        TimeRange secondTimeRange = TimeRange.between(LocalTime.parse(input.next()), LocalTime.parse(input.next()));
        System.out.println(secondTimeRange.contains(firstTimeRange));
    }
}

class TimeRange {
    final LocalTime start;
    final LocalTime end;

    private TimeRange(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    static TimeRange between(LocalTime start, LocalTime end) {
        return new TimeRange(start, end);
    }

    boolean contains(TimeRange time) {
        return !(this.start.isAfter(time.end) || this.end.isBefore(time.start));
    }
}
