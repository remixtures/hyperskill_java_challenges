package com.miguelcaetano.hyperskill.essential_standard_classes.how_many_date_time_pairs_match_the_range;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime firstNumber = LocalDateTime.parse(input.next());
        LocalDateTime secondNumber = LocalDateTime.parse(input.next());
        int size = input.nextInt();
        int numbersInRange = 0;
        for (int i = 0; i < size; i++) {
            LocalDateTime date = LocalDateTime.parse(input.next());
            if (firstNumber.isBefore(secondNumber)) {
                if (date.isAfter(firstNumber) && date.isBefore(secondNumber)
                        || date.isEqual(firstNumber)) {
                    numbersInRange++;
                }
            } else if (secondNumber.isBefore(firstNumber) && date.isAfter(secondNumber)
                    && date.isBefore(firstNumber) || date.isEqual(secondNumber)) {
                numbersInRange++;
            }
        }
        System.out.println(numbersInRange);
    }
}
