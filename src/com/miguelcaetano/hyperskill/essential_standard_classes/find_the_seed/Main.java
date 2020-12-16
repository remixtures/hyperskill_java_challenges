package com.miguelcaetano.hyperskill.essential_standard_classes.find_the_seed;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();
        int k = input.nextInt();
        int maxNumber;
        int minimumOfMaxes = k;
        int seed = 0;

        for (int i = a; i <= b; i++) {
            Random random = new Random(i);
            maxNumber = 0;
            for (int j = 0; j < n; j++) {
                int number = random.nextInt(k);
                if (number > maxNumber) {
                    maxNumber = number;
                }
            }
            if (minimumOfMaxes > maxNumber) {
                minimumOfMaxes = maxNumber;
                seed = i;
            }
        }

        System.out.println(seed);
        System.out.println(minimumOfMaxes);
    }
}