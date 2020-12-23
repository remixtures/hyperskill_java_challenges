package com.miguelcaetano.hyperskill.multithreading.check_whether_a_number_is_prime;

import java.math.BigInteger;

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        // write code of task here
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(number));
        if (probablePrime) {
            System.out.println(number);
        }
    }
}