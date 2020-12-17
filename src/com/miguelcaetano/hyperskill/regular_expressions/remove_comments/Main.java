package com.miguelcaetano.hyperskill.regular_expressions.remove_comments;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeWithComments = scanner.nextLine();
        String regExMatch = "(\\/\\*(\\s*|.*?)*\\*\\/)|(\\/\\/.*)";
        String codeWithoutComments = codeWithComments.replaceAll(regExMatch, "");
        System.out.println(codeWithoutComments);
    }
}
