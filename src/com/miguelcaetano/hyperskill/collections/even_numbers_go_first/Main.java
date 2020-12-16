package com.miguelcaetano.hyperskill.collections.even_numbers_go_first;

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        Deque<Integer> queue = new ArrayDeque<>();
        int inputNumber;
        for (int i = 0; i < numberOfElements; i++) {
            inputNumber = input.nextInt();
            if (inputNumber % 2 == 0) {
                queue.offerFirst(inputNumber);
            } else {
                queue.offerLast(inputNumber);
            }
        }

        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(queue.pollFirst());
        }
    }
}
