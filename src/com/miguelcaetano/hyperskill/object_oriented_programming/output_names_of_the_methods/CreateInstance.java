package com.miguelcaetano.hyperskill.object_oriented_programming.output_names_of_the_methods;

public class CreateInstance {

    public static SuperClass create() {
        return new SuperClass() {
            @Override
            public void method2() {
                System.out.println("method2");
            }

            @Override
            public void method3() {
                System.out.println("method3");
            }
        }; /* create an instance of an anonymous class here,
                                 do not forget ; on the end */
    }
}

// Don't change the code below

abstract class SuperClass {

    public static void method1() {
        System.out.println("");
    }

    public abstract void method2();

    public abstract void method3();
}
