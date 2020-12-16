package com.miguelcaetano.hyperskill.essential_standard_classes.some_hours_and_minutes_ago;

import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] actualPointInTime = input.nextLine().split(":");
        LocalTime presentTime = LocalTime.of(Integer.parseInt(actualPointInTime[0]),
                Integer.parseInt(actualPointInTime[1]));
        LocalTime pastTime = presentTime.minusHours(input.nextInt()).minusMinutes(input.nextInt());
        System.out.println(pastTime);
    }
}