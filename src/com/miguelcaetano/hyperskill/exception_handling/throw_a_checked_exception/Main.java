package com.miguelcaetano.hyperskill.exception_handling.throw_a_checked_exception;

import java.io.IOException;

public class Main {

    public static void method() throws Exception {
        throw new IOException("Some happened");
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}