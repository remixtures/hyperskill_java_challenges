package com.miguelcaetano.hyperskill.generics.print_content;

// do not remove imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define info method here
    static <E> String info(E[] array) {
        return Arrays.toString(array);
    }
}