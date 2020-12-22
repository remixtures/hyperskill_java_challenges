package com.miguelcaetano.hyperskill.object_oriented_programming.sort_out_the_classes;

import java.util.List;

class Sort {
    public static void sortShapes(Shape[] array,
                                  List<Shape> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle> circles) {
        // write your code here
        for (Shape shape : array) {
            if (shape.getClass() == Circle.class) {
                circles.add((Circle) shape);
            } else if (shape.getClass() == Square.class) {
                squares.add((Square) shape);
            } else if (shape.getClass() == Polygon.class) {
                polygons.add((Polygon) shape);
            } else {
                shapes.add((Shape) shape);
            }
        }
    }
}

//Don't change classes below
class Shape { }
class Polygon extends Shape { }
class Square extends Polygon { }
class Circle extends Shape { }
