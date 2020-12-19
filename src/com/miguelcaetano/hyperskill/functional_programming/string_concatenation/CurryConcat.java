package com.miguelcaetano.hyperskill.functional_programming.string_concatenation;

import java.util.Scanner;
import java.util.function.Function;

public class CurryConcat {

    public static String calc(String[] arr) {

        Function<String, Function<String, Function<String, Function<String, String>>>> stringFun =
                first -> second -> third -> fourth ->
                        first.toLowerCase() + third.toUpperCase() + second.toLowerCase() + fourth.toUpperCase();

        return stringFun.apply(arr[0]).apply(arr[1]).apply(arr[2]).apply(arr[3]);
    }

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        System.out.println(calc(values));
    }
}
