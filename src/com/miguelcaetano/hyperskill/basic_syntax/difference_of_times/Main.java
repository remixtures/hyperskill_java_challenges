package com.miguelcaetano.hyperskill.basic_syntax.difference_of_times;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstHours = 3600 * scanner.nextInt();
        int firstMinutes = 60 * scanner.nextInt();
        int firstSeconds = scanner.nextInt();
        int firstTime = firstHours + firstMinutes + firstSeconds;
        int secondHours = 3600 * scanner.nextInt();
        int secondMinutes = 60 * scanner.nextInt();
        int secondSeconds = scanner.nextInt();
        int secondTime = secondHours + secondMinutes + secondSeconds;
        int difference = secondTime - firstTime;
        System.out.println(difference);
    }
}
