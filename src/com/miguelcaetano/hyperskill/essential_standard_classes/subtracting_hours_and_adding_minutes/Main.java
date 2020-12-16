package com.miguelcaetano.hyperskill.essential_standard_classes.subtracting_hours_and_adding_minutes;

import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime presentTime = LocalDateTime.parse(input.nextLine());
        LocalDateTime newTime = presentTime.minusHours(input.nextInt()).plusMinutes(input.nextInt());
        System.out.println(newTime);
    }
}
