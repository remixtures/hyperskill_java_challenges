package com.miguelcaetano.hyperskill.exception_handling.avoid_npe;

import java.util.*;

public class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */
        if (string != null) {
            System.out.println(string.toLowerCase());
        } else {
            System.out.println("NPE!");
        }
    }
}
