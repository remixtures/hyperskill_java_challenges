package com.miguelcaetano.hyperskill.object_oriented_programming.too_many_cats;

public class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;


    public Cat(String name, int age) {
        // implement the constructor
        this.name = name;
        this.age = age;
        this.counter++;

        // do not forget to check the number of cats
        if (this.counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}
