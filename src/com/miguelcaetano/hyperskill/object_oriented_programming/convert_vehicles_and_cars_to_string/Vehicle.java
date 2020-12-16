package com.miguelcaetano.hyperskill.object_oriented_programming.convert_vehicles_and_cars_to_string;

class Vehicle {

    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate=" + licensePlate + '}';
    }
}

class Car extends Vehicle {

    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate=" + licensePlate +
                ",numberOfSeats=" + numberOfSeats +
                '}';
    }
}
