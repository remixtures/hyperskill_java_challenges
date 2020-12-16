package com.miguelcaetano.hyperskill.essential_standard_classes.seconds_since_start_of_a_day;

import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        LocalTime secondsSinceStartOfTheDay = LocalTime.ofSecondOfDay(seconds);
        System.out.println(secondsSinceStartOfTheDay);
    }
}