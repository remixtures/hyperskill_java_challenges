package com.miguelcaetano.hyperskill.collections.the_lifo_principle_in_action;

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numberOfElements; i++) {
            queue.offerLast(input.nextInt());
        }

        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(queue.pollLast());
        }
    }
}
