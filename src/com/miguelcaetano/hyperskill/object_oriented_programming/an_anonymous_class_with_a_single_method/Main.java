package com.miguelcaetano.hyperskill.object_oriented_programming.an_anonymous_class_with_a_single_method;

public class Main {

    public static void main(String[] args) {

        SingleMethodInterface instance = new SingleMethodInterface() {
            @Override
            public void doSomething() {
                System.out.println("The anonymous class does something");
            }
        };

        instance.doSomething();

    }
}

interface SingleMethodInterface {

    void doSomething();
}
