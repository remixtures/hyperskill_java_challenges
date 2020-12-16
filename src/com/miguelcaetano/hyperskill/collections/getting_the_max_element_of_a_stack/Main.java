package com.miguelcaetano.hyperskill.collections.getting_the_max_element_of_a_stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        MaxValueInStack stack = new MaxValueInStack();
        for (int index = 0; index < size; index++) {
            String command = input.next();
            switch (command) {
                case "push":
                    stack.push(input.nextInt());
                    break;
                case "pop":
                    stack.pop();
                    break;
                case "max":
                    System.out.println(stack.getMax());
                    break;
                default:
                    System.out.println("Sorry. Wrong command provided");
                    break;
            }
        }
    }

    static class MaxValueInStack {
        private Deque<Integer> totalValues = new ArrayDeque<>();
        private Deque<Integer> maxValues = new ArrayDeque<>();

        void push(int number) {
            totalValues.addLast(number);
            if (totalValues.size() == 1) {
                maxValues.addLast(number);
                return;
            }
            if (number > maxValues.peekLast()) {
                maxValues.addLast(number);
            } else {
                maxValues.addLast(maxValues.peekLast());
            }
        }

        int getMax() {
            return maxValues.getLast();
        }

        void pop() {
            totalValues.removeLast();
            maxValues.removeLast();
        }
    };
}
