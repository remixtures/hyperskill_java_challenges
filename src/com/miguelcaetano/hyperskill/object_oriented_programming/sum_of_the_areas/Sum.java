package com.miguelcaetano.hyperskill.object_oriented_programming.sum_of_the_areas;

class Sum {
    public static int sumOfAreas(Shape[] array) {
        // write your code here
        int totalArea = 0;

        for (Shape shape : array) {
            if (shape.getClass() == Rectangle.class) {
               totalArea += ((Rectangle) shape).getWidth() * ((Rectangle) shape).getHeight(); // right
            } else if (shape.getClass() == Square.class) {
                totalArea += ((Square) shape).getSide() * ((Square) shape).getSide();
            }
        }

        return totalArea;
    }
}

//Don't change the code below
class Shape {
}

class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
