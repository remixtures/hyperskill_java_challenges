package com.miguelcaetano.hyperskill.functional_programming.count_passwords;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    /**
     * Returns the number of elements in a given stream.
     *
     * @param passwordStream the input stream of strings
     * @return the number of elements in a given stream
     */
    public static long countPasswords(Stream<String> passwordStream) {
        // write your code here
        return passwordStream.count();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countPasswords(Arrays.stream(scanner.nextLine().split("\\s+"))));
    }
}