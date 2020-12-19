package com.miguelcaetano.hyperskill.object_oriented_programming.implement_a_default_method;

// do not change code below
public class Main {
    public static void main(String... args) {
        Printer printer = new ConsolePrinter();
        printer.print(); // prints: This is a default message
    }
}

class ConsolePrinter implements Printer {
}

interface Printer {
    // define and implement default method print to make code above print the message: "This is a default message"

    default void print() {
        System.out.println("This is a default message");
    }
}
