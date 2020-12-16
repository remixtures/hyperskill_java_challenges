package com.miguelcaetano.hyperskill.collections.companies;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String> lst = Arrays.asList(str.split(" "));
        System.out.println(lst);
    }
}