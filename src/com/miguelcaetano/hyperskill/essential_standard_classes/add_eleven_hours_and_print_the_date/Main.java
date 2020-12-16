package com.miguelcaetano.hyperskill.essential_standard_classes.add_eleven_hours_and_print_the_date;

import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime presentTime = LocalDateTime.parse(input.nextLine()).plusHours(11);
        System.out.println(presentTime.toLocalDate());
    }
}
