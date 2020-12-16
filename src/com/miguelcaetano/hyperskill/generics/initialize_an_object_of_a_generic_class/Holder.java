package com.miguelcaetano.hyperskill.generics.initialize_an_object_of_a_generic_class;

class Holder<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

class Main {
    public static void main(String... args) {
        // initialize an instance of Holder to make the code below compiled
        Holder<String> holder = new Holder<>();

        // do not change the code below
        holder.set("This is an instance of String");

        String value = holder.get();
        System.out.println(value);
    }
}
