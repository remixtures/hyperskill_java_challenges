package com.miguelcaetano.hyperskill.regular_expressions.check_ip_address;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ipAddress = input.nextLine();
        boolean regexMatch = ipAddress.matches("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)" +
                "(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        if (regexMatch) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}