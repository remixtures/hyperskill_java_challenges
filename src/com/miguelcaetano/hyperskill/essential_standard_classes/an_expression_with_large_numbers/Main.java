package com.miguelcaetano.hyperskill.essential_standard_classes.an_expression_with_large_numbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String longNumber = input.nextLine();
        String[] numbers = longNumber.split(" ");
        BigInteger a = new BigInteger(numbers[0]);
        BigInteger b = new BigInteger(numbers[1]);
        BigInteger c = new BigInteger(numbers[2]);
        BigInteger d = new BigInteger(numbers[3]);
        BigInteger result = a.negate().multiply(b).add(c).subtract(d);
        System.out.println(result);
    }
}
