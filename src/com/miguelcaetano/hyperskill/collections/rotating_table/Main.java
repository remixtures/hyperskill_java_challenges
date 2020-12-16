package com.miguelcaetano.hyperskill.collections.rotating_table;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> rowsAndColumns = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int rows = rowsAndColumns.get(0);
        ArrayList<ArrayList<String>> matrixOne;
        matrixOne = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            matrixOne.add(new ArrayList<String>());
            matrixOne.get(i).add(scanner.nextLine());
        }

        int rotatingDistance = scanner.nextInt();
        Collections.rotate(matrixOne, rotatingDistance);

        for (List<String> number : matrixOne) {
            number.forEach(value -> System.out.print(value + " "));
            System.out.println();
        }
    }
}