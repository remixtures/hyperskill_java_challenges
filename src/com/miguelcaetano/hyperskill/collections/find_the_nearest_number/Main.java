package com.miguelcaetano.hyperskill.collections.find_the_nearest_number;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String[] numbers = input.nextLine().split("\\s+");
        int number = input.nextInt();
        for (String stringNumber : numbers) {
            list.add(Integer.parseInt(stringNumber));
        }

        int minValue = Integer.MAX_VALUE;
        for (int value : list) {
            if (Math.abs(value - number) < minValue) {
                minValue = Math.abs(value - number);
            }
        }

        while (list.remove((Integer) (number - minValue))) {
            System.out.print(number - minValue + " ");
        }
        while (list.remove((Integer) (number + minValue))) {
            System.out.print(number + minValue + " ");
        }
    }
}
