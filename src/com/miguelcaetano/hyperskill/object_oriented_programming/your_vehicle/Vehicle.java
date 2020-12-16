package com.miguelcaetano.hyperskill.object_oriented_programming.your_vehicle;

class Vehicle {

    private String name;

    class Engine {

        void start() {
            System.out.println("RRRrrrrrrr....");
        }
    }
}

class EnjoyVehicle {

    public static void startVehicle() {
        // start your vehicle
        Vehicle myLittleDeuceCoupe = new Vehicle();
        Vehicle.Engine deuceCoupe = myLittleDeuceCoupe.new Engine();
        deuceCoupe.start();
    }
}
