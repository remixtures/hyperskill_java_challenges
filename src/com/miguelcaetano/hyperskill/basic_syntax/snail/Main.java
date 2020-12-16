package com.miguelcaetano.hyperskill.basic_syntax.snail;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heightFeet = input.nextInt();
        int upFeet = input.nextInt();
        int downFeet = input.nextInt();

        int days = (heightFeet - downFeet - 1) / (upFeet - downFeet) + 1;

        System.out.println(days);
    }
}
