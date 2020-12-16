package com.miguelcaetano.hyperskill.object_oriented_programming.shapes_area;

class Shape {
    public double area() {
        return 0;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    @Override
    public double area() {
        return (base * height) / 2;
    }
    // override the method here
}

class Circle extends Shape {
    double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // override the method here
}

class Square extends Shape {
    double side;

    @Override
    public double area() {
        return side * side;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    @Override
    public double area() {
        return width * height;
    }
}
