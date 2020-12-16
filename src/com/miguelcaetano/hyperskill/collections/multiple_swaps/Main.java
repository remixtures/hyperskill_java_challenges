package com.miguelcaetano.hyperskill.collections.multiple_swaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringsOne = scanner.nextLine();
        List<String> listOfNumbers = Arrays.asList(stringsOne.split(" "));

        int numberOfSwaps = scanner.nextInt();

        for (int i = 0; i < numberOfSwaps; i++) {
            Collections.swap(listOfNumbers, scanner.nextInt(), scanner.nextInt());
        }

        for (String number : listOfNumbers) {
            System.out.print(number + " ");
        }
    }
}