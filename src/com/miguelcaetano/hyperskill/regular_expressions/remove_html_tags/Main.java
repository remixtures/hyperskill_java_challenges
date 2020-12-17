package com.miguelcaetano.hyperskill.regular_expressions.remove_html_tags;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringWithHtmlTags = scanner.nextLine();
        String regExMatch = "\\<.*?\\>";
        String replacedText = stringWithHtmlTags.replaceAll(regExMatch, "");
        System.out.println(replacedText);
    }
}
