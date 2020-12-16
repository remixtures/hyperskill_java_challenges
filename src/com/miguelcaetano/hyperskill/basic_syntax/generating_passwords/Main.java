package com.miguelcaetano.hyperskill.basic_syntax.generating_passwords;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static List<Character> upperCase = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
    public static List<Character> lowerCase = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    public static List<Character> digits = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
    public static int lastIndex = 0;

    private static int getRandom(int limit) {
        Random randomNumber = new Random();
        return randomNumber.nextInt(limit);
    }

    private static char getSymbol(List<Character> symbol) {
        int order;
        do {
            order = getRandom(symbol.size());
        } while (lastIndex == order);
        lastIndex = order;
        return symbol.get(order);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] separated = line.split("\\s");
        List<Integer> arguments = Arrays.stream(separated).map(Integer::valueOf).collect(Collectors.toList());
        StringBuilder password = new StringBuilder();

        int i = 0;
        for (int j = 0; j < arguments.get(0); j++) {
            password.append(getSymbol(upperCase));
            i++;
        }
        for (int j = 0; j < arguments.get(1); j++) {
            password.append(getSymbol(lowerCase));
            i++;
        }
        for (int j = 0; j < arguments.get(2); j++) {
            password.append(getSymbol(digits));
            i++;
        }
        for (int j = i; j < arguments.get(3); j++) {
            password.append(getSymbol(upperCase));
        }

        System.out.println(password.toString());
    }
}