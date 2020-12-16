package com.miguelcaetano.hyperskill.basic_syntax.queens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double slope = Math.abs(y2 - y1) / Math.abs(x2 - x1);
        if (x1 == y1 && x2 == y2 || x1 == x2 || y1 == y2 || slope == 1.00)  {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
