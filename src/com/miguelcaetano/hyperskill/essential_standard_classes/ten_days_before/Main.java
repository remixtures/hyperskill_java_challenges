package com.miguelcaetano.hyperskill.essential_standard_classes.ten_days_before;

import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dateStr = input.nextLine();
        LocalDate date = LocalDate.parse(dateStr);
        System.out.println(date.minusDays(10));
    }
}
