package com.miguelcaetano.hyperskill.basic_syntax.reversing_input_numbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int tempFirst = first;
        int tempSecond = second;
        second = tempFirst;
        first = tempSecond;
        System.out.println(first + " " + second);
    }
}
