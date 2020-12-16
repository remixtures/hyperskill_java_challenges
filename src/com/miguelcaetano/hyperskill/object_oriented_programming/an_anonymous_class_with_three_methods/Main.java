package com.miguelcaetano.hyperskill.object_oriented_programming.an_anonymous_class_with_three_methods;

public class Main {

    public static void main(String[] args) {

        ThreeMethodsInterface instance = new ThreeMethodsInterface() {
            @Override
            public void do1() {
                System.out.println("Implemented do1");
            }

            @Override
            public void do2() {
                System.out.println("Implemented do2");
            }

            @Override
            public void do3() {
                System.out.println("Implemented do3");
            }
        };

        instance.do1();
        instance.do2();
        instance.do3();
    }
}

interface ThreeMethodsInterface {

    void do1();

    void do2();

    void do3();
}
