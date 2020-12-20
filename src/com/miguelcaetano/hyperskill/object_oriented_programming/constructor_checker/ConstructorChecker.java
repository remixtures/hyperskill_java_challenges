package com.miguelcaetano.hyperskill.object_oriented_programming.constructor_checker;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 Check whether the class declares public parameterless constructor
 */
class ConstructorChecker {

    public boolean checkPublicParameterlessConstructor(Class<?> clazz) {
        // Add implementation here
        Constructor[] constructors = clazz.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            Class[] parameters = constructor.getParameterTypes();
            if (parameters.length == 0 && Modifier.isPublic(constructor.getModifiers())) {
                return true;
            }
        }

        return false;
    }
}
