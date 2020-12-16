package com.miguelcaetano.hyperskill.object_oriented_programming.shape_hierarchy;

abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return  2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {

    double length;
    double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    double getPerimeter() {
        return length * 2 + height * 2;
    }

    @Override
    double getArea() {
        return length * height;
    }
}

class Triangle extends Shape {

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
