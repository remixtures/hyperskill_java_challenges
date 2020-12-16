package com.miguelcaetano.hyperskill.object_oriented_programming.getting_superclass;

public class SuperClassGetter {

    public Class getSuperClassByName(String name) throws ClassNotFoundException {
        Class nameClass = Class.forName(name);
        return nameClass.getSuperclass();
    }

    public Class getSuperClassByInstance(Object object) {
        return object.getClass().getSuperclass();
    }
}
