package com.miguelcaetano.hyperskill.essential_standard_classes.convert_numbers_to_days;

import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        LocalDate dateOne = LocalDate.ofYearDay(year, scanner.nextInt());
        LocalDate dateTwo = LocalDate.ofYearDay(year, scanner.nextInt());
        LocalDate dateThree = LocalDate.ofYearDay(year, scanner.nextInt());
        System.out.println(dateOne);
        System.out.println(dateTwo);
        System.out.println(dateThree);
    }
}
