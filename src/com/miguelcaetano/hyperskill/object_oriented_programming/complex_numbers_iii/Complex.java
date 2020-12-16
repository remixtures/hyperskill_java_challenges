package com.miguelcaetano.hyperskill.object_oriented_programming.complex_numbers_iii;

public class Complex {

    double real;
    double image;

    public void add(Complex num) {
        this.real += num.real;
        this.image += num.image;
    }

    public void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
    }
    // write methods here
}