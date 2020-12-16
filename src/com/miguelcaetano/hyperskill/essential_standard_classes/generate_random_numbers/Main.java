package com.miguelcaetano.hyperskill.essential_standard_classes.generate_random_numbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();

        Random random = new Random(a + b);
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int numberInRange = random.nextInt(b - a + 1) + a;
            sum += numberInRange;
        }

        System.out.println(sum);
    }
}
