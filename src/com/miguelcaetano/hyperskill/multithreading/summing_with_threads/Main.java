package com.miguelcaetano.hyperskill.multithreading.summing_with_threads;

import java.util.Scanner;

public class Main {

    private static long mainThreadId = Thread.currentThread().getId();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int from1Incl = scanner.nextInt(); // left limit of the first range
        int to1Incl = scanner.nextInt();   // right limit of the first range

        int from2Incl = scanner.nextInt(); // left limit of the second range
        int to2Incl = scanner.nextInt();   // right limit of the second range

        RangeSummator summator1 = new RangeSummator(from1Incl, to1Incl); // first summator
        RangeSummator summator2 = new RangeSummator(from2Incl, to2Incl); // second summator
        summator1.start();
        summator2.start();
        summator1.join();
        summator2.join();
        long partialSum1 = summator1.getResult();
        long partialSum2 = summator2.getResult();

        long sum = partialSum1 + partialSum2; // the sum is 0, fix it!

        System.out.println(sum);
    }

    //Don't change the code below
    static class RangeSummator extends Thread {

        int fromIncl;
        int toIncl;

        private volatile long result = 0;

        public RangeSummator(int fromIncl, int toIncl) {
            this.fromIncl = fromIncl;
            this.toIncl = toIncl;
        }

        @Override
        public void run() {
            final long currentId = Thread.currentThread().getId();

            if (currentId == mainThreadId) {
                throw new RuntimeException("You must start a new thread!");
            }

            long sum = 0;
            for (int i = fromIncl; i <= toIncl; i++) {
                sum += i;
            }

            result = sum;
        }

        public long getResult() {
            return result;
        }
    }
}
