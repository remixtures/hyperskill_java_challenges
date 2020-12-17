package com.miguelcaetano.hyperskill.design_patterns.static_factory_methods_for_time;

import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static Time noon() {
        return new Time(12, 0, 0);
    }


    public static Time midnight() {
        return new Time(0, 0, 0);
    }

    public static Time ofSeconds(long seconds) {
        int hour = (int) seconds / 3600 % 24;
        int minute = (int) (seconds % 3600) / 60;
        int second = (int) seconds % 60;
        return new Time(hour, minute, second);
    }

    public static Time of(int hour, int minute, int second) {
        if (hour < 0 || 23 < hour) {
            return null;
        }

        if (minute < 0 || 59 < minute) {
            return null;
        }

        if (second < 0 || 59 < second) {
            return null;
        }

        return new Time(hour, minute, second);
    }
}
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}
