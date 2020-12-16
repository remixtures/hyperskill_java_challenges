package com.miguelcaetano.hyperskill.basic_syntax.the_army_of_units;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int army = scanner.nextInt();
        if (army < 1) {
            System.out.println("no army");
        }
        if (army >= 1 && army <= 4) {
            System.out.println("few");
        }
        if (army >= 5 && army <= 9){
            System.out.println("several");
        }
        if (army >= 10 && army <= 19) {
            System.out.println("pack");
        }
        if (army >= 20 && army <= 49) {
            System.out.println("lots");
        }
        if (army >= 50 && army <= 99) {
            System.out.println("horde");
        }
        if (army >= 100 && army <= 249) {
            System.out.println("throng");
        }
        if (army >= 250 && army <= 499) {
            System.out.println("swarm");
        }
        if (army >= 500 && army <= 999) {
            System.out.println("zounds");
        }
        if (army >= 1000) {
            System.out.println("legion");
        }
    }
}