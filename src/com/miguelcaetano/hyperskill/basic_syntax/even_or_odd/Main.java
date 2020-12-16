package com.miguelcaetano.hyperskill.basic_syntax.even_or_odd;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number % 2 == 0) {
                System.out.println("even");
            } else if (number % 2 != 0) {
                System.out.println("odd");
            }
        }
    }
}
