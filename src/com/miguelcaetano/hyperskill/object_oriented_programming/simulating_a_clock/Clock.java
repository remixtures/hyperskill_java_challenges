package com.miguelcaetano.hyperskill.object_oriented_programming.simulating_a_clock;

public class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {

        if (minutes < 59) {
            minutes++;
        } else {
            minutes = 00;
            if (hours < 12) {
                hours++;
            } else {
                hours = 01;
            }
            // implement me
        }
    }
}
