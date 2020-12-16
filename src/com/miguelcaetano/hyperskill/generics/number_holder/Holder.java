package com.miguelcaetano.hyperskill.generics.number_holder;

class Holder<T extends Number> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}