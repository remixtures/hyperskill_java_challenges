package com.miguelcaetano.hyperskill.generics.invert_an_array;

    // do not remove imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define invert method here
    static <E> E[] invert(E[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }

}

