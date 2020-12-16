package com.miguelcaetano.hyperskill.generics.how_many_type_variables_reflected;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

class TypeVariablesInspector {
    public void printTypeVariablesCount(TestClass obj, String methodName) throws Exception {
        // Add implementation here
        Method method = TestClass.class.getDeclaredMethod(methodName);
        Type[] parameterTypes = method.getTypeParameters();
        System.out.println(parameterTypes.length);
    }
}

class TestClass {

    public <A, B, C> void someMethod() {
        //
    }

}