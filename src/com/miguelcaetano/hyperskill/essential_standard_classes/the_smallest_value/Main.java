package com.miguelcaetano.hyperskill.essential_standard_classes.the_smallest_value;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String zero = "0";
        String number = input.nextLine();

        if (number.equals(zero)) {
            System.out.println(0);
        } else {
            BigInteger bigNumber = new BigInteger(number);
            BigInteger result = BigInteger.ONE;

            long i = 1;
            while (result.compareTo(bigNumber) < 0) {
                i++;
                result = result.multiply(BigInteger.valueOf(i));
            }

            System.out.println(i);
        }
    }
}
