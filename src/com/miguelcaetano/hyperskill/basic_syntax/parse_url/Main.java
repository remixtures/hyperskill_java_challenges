package com.miguelcaetano.hyperskill.basic_syntax.parse_url;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String url = input.nextLine();

        String[] address = url.split("\\?");
        String[] pairOfValues = address[1].split("\\&");
        String password = "";

        for (String query : pairOfValues) {
            String[] keyValue = query.split("=");
            if (keyValue.length == 1) {
                System.out.println(keyValue[0] + " : " + "not found");
            } else {
                System.out.println(keyValue[0] + " : " + keyValue[1]);
            }
            if (keyValue[0].equals("pass")) {
                password = "password : " + keyValue[1];
            }
        }
        System.out.println(password);
    }
}