package com.miguelcaetano.hyperskill.essential_standard_classes.return_time_without_seconds;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalTime timeWithSeconds = LocalTime.parse(input.nextLine());
        System.out.println(timeWithSeconds.minusSeconds(timeWithSeconds.getSecond()));
    }
}