package com.miguelcaetano.hyperskill.essential_standard_classes.seconds_between_two_time_points;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalTime presentTime = LocalTime.parse(input.nextLine());
        LocalTime futureTime = LocalTime.parse(input.nextLine());
        System.out.println(Math.abs(presentTime.toSecondOfDay() - futureTime.toSecondOfDay()));
    }
}
