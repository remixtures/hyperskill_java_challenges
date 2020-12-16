package com.miguelcaetano.hyperskill.exception_handling.throw_an_io_exception;

import java.io.IOException;

public class Main {

    // change this method
    public static void method() throws IOException {
        throw new IOException();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}