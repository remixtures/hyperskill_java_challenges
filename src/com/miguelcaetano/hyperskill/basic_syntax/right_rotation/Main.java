package com.miguelcaetano.hyperskill.basic_syntax.right_rotation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numbersString = input.nextLine();
        String[] arrayOfNumbersString = numbersString.split(" ");
        String[] newArrayOfNumbers = new String[arrayOfNumbersString.length];
        int numberOfRotations = input.nextInt();

        for (int i = 0; i < arrayOfNumbersString.length; i++) {
            newArrayOfNumbers[(i + numberOfRotations) % arrayOfNumbersString.length] = arrayOfNumbersString[i];
        }

        for (String number : newArrayOfNumbers) {
            System.out.print(number + " ");
        }
    }
}
