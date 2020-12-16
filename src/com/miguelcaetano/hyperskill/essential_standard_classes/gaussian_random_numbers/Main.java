package com.miguelcaetano.hyperskill.essential_standard_classes.gaussian_random_numbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        double m = input.nextDouble();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                random = new Random(k);
            }
            if (random.nextGaussian() > m) {
                i = -1;
                k++;
            }
        }
        System.out.println(k);
    }
}
