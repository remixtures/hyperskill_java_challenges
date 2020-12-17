package com.miguelcaetano.hyperskill.collections.substitution_cipher;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] inChars = input.nextLine().toCharArray();
        char[] outChars = input.nextLine().toCharArray();
        char[] messageToEncrypt = input.nextLine().toCharArray();
        char[] messageToDecrypt = input.nextLine().toCharArray();

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < inChars.length; i++) {
            map.put(inChars[i], outChars[i]);
        }

        for (char letter : messageToEncrypt) {
            System.out.print(map.get(letter));
        }

        System.out.println("");

        for (char letter : messageToDecrypt) {
            for (Object key : map.keySet()) {
                if (map.get(key).equals(letter)) {
                    System.out.print(key);
                }
            }
        }
    }
}