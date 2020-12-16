package com.miguelcaetano.hyperskill.object_oriented_programming.car;

public class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        if (speed > 0) {
            speed -= 5;
        }
    }
}