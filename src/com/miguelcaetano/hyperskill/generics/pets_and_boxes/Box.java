package com.miguelcaetano.hyperskill.generics.pets_and_boxes;

class Box<T extends Animal> {

    T add(T t) {
        return t;
    }

}
//...finish the code of the class

// Don't change the code below
class Animal { }