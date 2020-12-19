package com.miguelcaetano.hyperskill.object_oriented_programming.create_prototype;

public class Main {
    public static void main(String[] args) {
        // write your code
        IPhone154.PrototypeIPhone154 protoIphone = new IPhone154.PrototypeIPhone154();
        protoIphone.printMinCost();
    }
}

// An internal staff of the testing platform. Do not change it
class IPhone154 {
    static double minCost = initCost();

    static class PrototypeIPhone154 {
        void printMinCost() {
            System.out.println("The min cost of IPhone154 should be: " + minCost + "$");
        }
    }

    private static double initCost() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextDouble();
    }
}