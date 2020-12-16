package com.miguelcaetano.hyperskill.basic_syntax.bus_tour;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int busHeight = input.nextInt();
        int numberOfBridges = input.nextInt();
        boolean willItCrash = false;
        int[] bridgesHeights = new int[numberOfBridges];
        int bridgeNumber = 0;
        for (int i = 0; i < numberOfBridges; i++) {
            bridgesHeights[i] = input.nextInt();
            if (bridgesHeights[i] > busHeight) {
                willItCrash = false;
            } else if (bridgesHeights[i] <= busHeight) {
                bridgeNumber = i + 1;
                willItCrash = true;
                break;
            }
        }
        if (willItCrash) {
            System.out.println("Will crash on bridge " + bridgeNumber);
        } else {
            System.out.println("Will not crash");
        }
    }
}