package com.miguelcaetano.hyperskill.essential_standard_classes.adding_n_minutes;

import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime presentTime = LocalDateTime.parse(input.nextLine());
        LocalDateTime futureTime = presentTime.plusMinutes(input.nextInt());
        int year = futureTime.getYear();
        int day = futureTime.getDayOfYear();
        LocalTime futureLocalTime = futureTime.toLocalTime();
        System.out.printf("%d %d " + futureLocalTime, year, day);
    }
}
