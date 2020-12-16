package com.miguelcaetano.hyperskill.basic_syntax.test_learners;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.print("Yes!");
                break;
            case 2:
                System.out.print("No!");
                break;
            case 3:
                System.out.print("No!");
                break;
            case 4:
                System.out.print("No!");
                break;
            default:
                System.out.print("Unknown number");
                break;
        }
    }
}