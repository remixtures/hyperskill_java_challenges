package com.miguelcaetano.hyperskill.basic_syntax.check_burgs;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cityName = input.nextLine();
        if (cityName.endsWith("burg")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
