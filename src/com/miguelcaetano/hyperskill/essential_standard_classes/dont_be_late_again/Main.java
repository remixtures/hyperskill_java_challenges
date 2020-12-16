package com.miguelcaetano.hyperskill.essential_standard_classes.dont_be_late_again;

import java.util.*;
import java.time.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStores = input.nextInt();
        Map<String, LocalTime> listOfStoresClosingTimes = new LinkedHashMap<>(numberOfStores);
        for (int i = 0; i < numberOfStores; i++) {
            listOfStoresClosingTimes.put(input.next(), LocalTime.parse(input.next()));
        }

        for (Map.Entry<String, LocalTime> entry : listOfStoresClosingTimes.entrySet()) {
            if (entry.getValue().isAfter(LocalTime.of(20, 00))) {
                System.out.println(entry.getKey());
            }
        }
    }
}
