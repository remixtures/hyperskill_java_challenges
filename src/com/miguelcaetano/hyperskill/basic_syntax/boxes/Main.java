package com.miguelcaetano.hyperskill.basic_syntax.boxes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String first = input.nextLine();
        String[] firstArray = first.split(" ");
        int[] boxOne = new int[3];
        for (int i = 0; i < boxOne.length; i++) {
            boxOne[i] = Integer.parseInt(firstArray[i]);
        }
        Arrays.sort(boxOne);

        String two = input.nextLine();
        String[] secondArray = two.split(" ");
        int[] boxTwo = new int[3];
        for (int i = 0; i < boxTwo.length; i++) {
            boxTwo[i] = Integer.parseInt(secondArray[i]);
        }
        Arrays.sort(boxTwo);

        int oneIsBigger = 0;
        int twoIsBigger = 0;

        for (int i = 0; i < boxOne.length; i++) {
            if (boxOne[i] < boxTwo[i]) {
                oneIsBigger++;
            } else if (boxOne[i] > boxTwo[i]) {
                twoIsBigger++;
            }
        }

        if (oneIsBigger == 3) {
            System.out.println("Box 1 < Box 2");
        } else if (twoIsBigger == 3) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}