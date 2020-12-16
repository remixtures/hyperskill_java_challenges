package com.miguelcaetano.hyperskill.essential_standard_classes.getting_information_on_a_day;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dateString = input.nextLine();
        LocalDate date = LocalDate.parse(dateString);
        System.out.print(date.getDayOfYear());
        System.out.print(" ");
        System.out.println(date.getDayOfMonth());
    }
}