package com.miguelcaetano.hyperskill.basic_syntax.good_rest_on_vacation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodExpenses = scanner.nextInt() * days;
        int airplaneTickets = scanner.nextInt() * 2;
        int hotelNights = scanner.nextInt() * (days - 1);
        int totalExpenses = foodExpenses + airplaneTickets + hotelNights;
        System.out.println(totalExpenses);
    }
}