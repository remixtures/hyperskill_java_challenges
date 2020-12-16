package com.miguelcaetano.hyperskill.object_oriented_programming.retrieve_class_name;

public class ClassGetter {

    public String getObjectClassName(Object object) {
        return object.getClass().getName();
    }
}
