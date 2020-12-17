package com.miguelcaetano.hyperskill.regular_expressions.check_the_clock_time;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[0-1][0-9]\\:[0-5][0-9]|[2][0-3]\\:[0-5][0-9]";

        String time = scanner.nextLine();
        System.out.println(time.matches(regex) ? "YES" : "NO");
    }
}
