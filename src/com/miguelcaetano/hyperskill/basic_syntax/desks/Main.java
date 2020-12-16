package com.miguelcaetano.hyperskill.basic_syntax.desks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();
        System.out.println(firstGroup % 2 + firstGroup / 2 + secondGroup % 2
                + secondGroup / 2 + thirdGroup % 2 + thirdGroup / 2);
    }
}
