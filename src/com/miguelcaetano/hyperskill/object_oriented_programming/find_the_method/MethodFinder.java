package com.miguelcaetano.hyperskill.object_oriented_programming.find_the_method;

import java.lang.reflect.Method;

public class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        for (String nameClass : classNames) {
            for (Method method : Class.forName(nameClass).getMethods()) {
                if (method.getName().equals(methodName)) {
                    return Class.forName(nameClass).getName();
                }
            }
        }
        return "";
    }
}
