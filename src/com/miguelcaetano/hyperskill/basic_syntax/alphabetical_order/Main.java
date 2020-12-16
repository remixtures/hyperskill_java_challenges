package com.miguelcaetano.hyperskill.basic_syntax.alphabetical_order;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] array = input.nextLine().split(" ");

        int size = array.length;
        boolean check = true;

        for (int i = 0; i < size - 1; i++) {
            if (array[i].compareTo(array[i + 1]) <= 0 && array[i].length() <= array[i + 1].length()) {
                check = true;
            } else {
                check = false;
            }
        }
        System.out.println(check);
    }
}