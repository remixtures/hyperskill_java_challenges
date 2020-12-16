package com.miguelcaetano.hyperskill.object_oriented_programming.area_of_a_circle;

import java.util.Scanner; // do not remove the import

class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

}

// do not change the interface
interface Measurable {
    double area();
}
