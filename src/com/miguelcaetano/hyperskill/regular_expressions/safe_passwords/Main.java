package com.miguelcaetano.hyperskill.regular_expressions.safe_passwords;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hardToCrackPassword = input.nextLine();
        String lowerCases = ".*[a-z]+.*";
        String upperCases = ".*[A-Z]+.*";
        String digits = ".*\\d.*";
        String size = ".{12,}";
        boolean regexMatch = hardToCrackPassword.matches(upperCases) && hardToCrackPassword.matches(lowerCases)
                && hardToCrackPassword.matches(digits) && hardToCrackPassword.matches(size);
        if (regexMatch) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

