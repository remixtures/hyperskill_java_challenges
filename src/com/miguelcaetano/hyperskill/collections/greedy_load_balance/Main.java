package com.miguelcaetano.hyperskill.collections.greedy_load_balance;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTasks = scanner.nextInt();
        int firstQueueLoad = 0;
        int secondQueueLoad = 0;
        Queue<Integer> firstQueue = new ArrayDeque<>();
        Queue<Integer> secondQueue = new ArrayDeque<>();

        for (int i = 0; i < numberOfTasks; i++) {
            if (firstQueueLoad <= secondQueueLoad) {
                firstQueue.offer(scanner.nextInt());
                firstQueueLoad += scanner.nextInt();
            } else {
                secondQueue.offer(scanner.nextInt());
                secondQueueLoad += scanner.nextInt();
            }
        }
        for (int task: firstQueue) {
            System.out.print(task + " ");
        }
        for (int task: secondQueue) {
            System.out.print(task + " ");
        }
    }
}
