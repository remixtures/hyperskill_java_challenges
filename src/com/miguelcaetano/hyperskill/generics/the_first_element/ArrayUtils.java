package com.miguelcaetano.hyperskill.generics.the_first_element;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define getFirst method here
    static <E> E getFirst(E[] array) {
        if (array.length == 0 || Objects.isNull(array[0])) {
            return null;
        }

        return array[0];
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{10, 6, 2, 3};
        System.out.println( getFirst(array));

        String[] array2 = new String[]{"one", "two", "three", "four"};
        System.out.println( getFirst(array2));

    }
}
