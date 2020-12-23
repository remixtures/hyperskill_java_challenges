package com.miguelcaetano.hyperskill.multithreading.check_whether_a_number_is_prime;

import java.util.Scanner;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newCachedThreadPool();;
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number != 1) {
                executor.submit(new PrintIfPrimeTask(number));
            }
        }

        executor.shutdown();
    }
}