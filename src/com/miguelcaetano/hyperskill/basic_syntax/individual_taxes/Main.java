package com.miguelcaetano.hyperskill.basic_syntax.individual_taxes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfCompanies = input.nextInt();
        int[] yearlyIncome = new int[numberOfCompanies];
        for (int i = 0; i < numberOfCompanies; i++) {
            yearlyIncome[i] = input.nextInt();
        }
        int[] taxPercentage = new int[numberOfCompanies];
        for (int i = 0; i < taxPercentage.length; i++) {
            taxPercentage[i] = input.nextInt();
        }

        double[] taxAmount = new double[numberOfCompanies];
        for (int i = 0; i < numberOfCompanies; i++) {
            if (yearlyIncome[i] != 0 && taxPercentage[i] != 0) {
                taxAmount[i] = yearlyIncome[i] * (taxPercentage[i] / 100.0);
            } else {
                taxAmount[i] = 0;
            }
        }

        double maxTaxes = Integer.MIN_VALUE;

        int index = 0;

        for (int i = 0; i < taxAmount.length; i++) {
            if (maxTaxes < taxAmount[i]) {
                maxTaxes = taxAmount[i];
                index = i + 1;
            }
        }

        System.out.println(index);
    }
}