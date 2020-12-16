package com.miguelcaetano.hyperskill.generics.pets_in_boxes;

public class BoxInside {

    // Complete this method
    public static void showAnimal(Box<? extends Animal> animal) {
        System.out.println(animal);
    }
}

// Don't change the code below
class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Box<T> {

    private T animal;

    void setAnimal(T animal) {
        this.animal = animal;
    }

    T getAnimal() {
        return animal;
    }
}