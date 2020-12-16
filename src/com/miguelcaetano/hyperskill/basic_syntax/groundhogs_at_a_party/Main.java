package com.miguelcaetano.hyperskill.basic_syntax.groundhogs_at_a_party;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peanutButterCups = scanner.nextInt();
        boolean isItWeekend = scanner.nextBoolean();
        boolean regularParties = !isItWeekend && peanutButterCups >= 10 && peanutButterCups <= 20;
        boolean weekendParties = isItWeekend && peanutButterCups >= 15 && peanutButterCups <= 25;
        if (regularParties || weekendParties) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
