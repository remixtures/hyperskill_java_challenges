package com.miguelcaetano.hyperskill.basic_syntax.application_as_a_class;

public class Application {

    String name;

    void run(String[] args) {
        System.out.println(name);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}