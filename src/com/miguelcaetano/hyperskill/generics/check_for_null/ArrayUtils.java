package com.miguelcaetano.hyperskill.generics.check_for_null;

// do not remove imports
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils<E> {
    // define hasNull method here
    static <E> boolean hasNull(E[] array) {

        if (array.length == 0) {
            return false;
        }

        for (E element : array) {
            if (Objects.isNull(element)) {
                return true;
            }
        }
        return false;
    }
}
