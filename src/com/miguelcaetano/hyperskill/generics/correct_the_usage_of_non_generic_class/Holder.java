package com.miguelcaetano.hyperskill.generics.correct_the_usage_of_non_generic_class;

class Holder {
    private Object value;

    public void set(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }
}

class Main {
    public static void main(String... args) {
        Holder holder = new Holder();
        holder.set(256);

        // correct the line to make the code compiled
        Object value = holder.get();

        // do not change
        System.out.println(value);
    }
}
