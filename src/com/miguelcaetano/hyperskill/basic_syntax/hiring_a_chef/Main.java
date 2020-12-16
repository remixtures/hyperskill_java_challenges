package com.miguelcaetano.hyperskill.basic_syntax.hiring_a_chef;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        Integer.valueOf(input.nextLine());
        input.nextLine();
        Integer.valueOf(input.nextLine());
        String cuisinePreference = input.nextLine();

        System.out.println("The form for " + firstName + " is completed." +
                " We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");

    }
}
