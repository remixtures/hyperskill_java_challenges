package com.miguelcaetano.hyperskill.exception_handling.days_of_the_week;

import java.util.*;

public class Main {

    public static String getDayOfWeekName(int number) {
        String day = "";
        switch (number) {
            case 1:
                day = "Mon";
                break;
            case 2:
                day = "Tue";
                break;
            case 3:
                day = "Wed";
                break;
            case 4:
                day = "Thu";
                break;
            case 5:
                day = "Fri";
                break;
            case 6:
                day = "Sat";
                break;
            case 7:
                day = "Sun";
                break;
            default:
                throw new IllegalArgumentException("Invalid day number: " + number);
        }
        return day;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}
