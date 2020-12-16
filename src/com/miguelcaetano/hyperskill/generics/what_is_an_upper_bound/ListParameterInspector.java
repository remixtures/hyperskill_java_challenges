package com.miguelcaetano.hyperskill.generics.what_is_an_upper_bound;

// Do not remove imports
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import java.util.Set;
import java.util.Scanner;

class ListParameterInspector {
    // Do not change the method
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String methodName = scanner.next();

        ListParameterInspector inspector = new ListParameterInspector();
        inspector.printParameterType(new TestClass(), methodName);
    }

    public void printParameterType(TestClass obj, String methodName) throws Exception {
        // Add implementation here
        Method method = TestClass.class.getDeclaredMethod(methodName);
        ParameterizedType parameterizedType = (ParameterizedType) method.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) parameterizedType.getActualTypeArguments()[0];
        System.out.println(wildcardType.getUpperBounds()[0].getTypeName());
    }
}

class TestClass {
    public Set<? extends String> someMethod() {
        //
        return null;
    }
}
