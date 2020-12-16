package com.miguelcaetano.hyperskill.basic_syntax.the_product_of_numbers_from_a_to_b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String readLine = input.nextLine();

        String[] numbers = readLine.split(" ");

        long numberOne = Integer.parseInt(numbers[0]);
        long numberTwo = Integer.parseInt(numbers[1]);
        long products = 1;

        for (long i = numberOne; i < numberTwo; i++) {
            products *= i;
        }
        System.out.println(products);

    }
}
