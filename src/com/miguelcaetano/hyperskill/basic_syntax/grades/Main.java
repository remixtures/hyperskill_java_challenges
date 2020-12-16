package com.miguelcaetano.hyperskill.basic_syntax.grades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int graceC = 0;
        int gradeD = 0;
        int buffer;

        for (int i = 0; i < range; i++) {
            buffer = scan.nextInt();
            if (buffer == 5) { gradeA += 1; }
            if (buffer == 4) { gradeB += 1; }
            if (buffer == 3) { graceC += 1; }
            if (buffer == 2) { gradeD += 1; }
        }

        System.out.println(gradeD + " " + graceC + " " + gradeB + " " + gradeA);

    }
}