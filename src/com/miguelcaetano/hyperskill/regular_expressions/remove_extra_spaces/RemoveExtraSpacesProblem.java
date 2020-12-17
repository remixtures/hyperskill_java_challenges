package com.miguelcaetano.hyperskill.regular_expressions.remove_extra_spaces;

import java.util.Scanner;

public class RemoveExtraSpacesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regExMatch = "\\s+";
        String replacedText = text.replaceAll(regExMatch, " ").trim();
        System.out.println(replacedText);
    }
}
