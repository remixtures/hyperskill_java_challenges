package com.miguelcaetano.hyperskill.essential_standard_classes.add_days_and_subtract_hours;

import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] time = input.nextLine().split(" ");
        LocalDateTime presentTime = LocalDateTime.parse(time[0]);
        System.out.println(presentTime.plusDays(Integer.parseInt(time[1])).minusHours(Integer.parseInt(time[2])));
    }
}