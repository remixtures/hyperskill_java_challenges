package com.miguelcaetano.hyperskill.object_oriented_programming.convert_persons_and_patients_to_string;

class Person {

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ",age=" + age +
                '}';
    }
}

class Patient extends Person {

    protected int height;

    public Patient(String name, int age, int height) {
        super(name, age);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name=" + name +
                ",age=" + age +
                ",height=" + height +
                '}';
    }
}
