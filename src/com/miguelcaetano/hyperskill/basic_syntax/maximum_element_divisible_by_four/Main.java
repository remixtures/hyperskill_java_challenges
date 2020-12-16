package com.miguelcaetano.hyperskill.basic_syntax.maximum_element_divisible_by_four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int elements;
        int max = 0;
        int num = in.nextInt();

        if (num < 3000) {
            for (int i = 0; i < num; i++) {
                elements = in.nextInt();
                if (elements % 4 == 0 && elements < 1000 && max < elements) {
                    max = elements;
                }
            }
        }
        System.out.println(max);
    }
}
