package com.miguelcaetano.hyperskill.exception_handling.throw_an_unchecked_exception;

public class Main {

    public static void method() {
        RuntimeException exception = new RuntimeException();
        throw exception;
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
