package com.miguelcaetano.hyperskill.object_oriented_programming.complex_numbers_hash_code_and_equals;

import java.util.Objects;

class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof ComplexNumber)) {
            return false;
        }

        ComplexNumber otherComplexNumber = (ComplexNumber) other;
        return re == otherComplexNumber.re && im == otherComplexNumber.im;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) Double.doubleToLongBits(re);
        result = 31 * result + (int) Double.doubleToLongBits(im);
        return result;
    }
}