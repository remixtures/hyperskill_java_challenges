package com.miguelcaetano.hyperskill.basic_syntax.how_many_nuts_each_squirrel_will_get;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();
        int nutsPerSquirrels = nuts / squirrels;
        System.out.println(nutsPerSquirrels);
    }
}
