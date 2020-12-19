package com.miguelcaetano.hyperskill.logging.find_integer_values_of_log_levels;

import java.util.*;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] loggingLevelsarray = input.nextLine().toUpperCase().split(" ");
        int sum = 0;
        for (String loggingLevel : loggingLevelsarray) {
            sum += Level.parse(loggingLevel).intValue();
        }
        System.out.println(sum);
    }
}
