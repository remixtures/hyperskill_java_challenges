package com.miguelcaetano.hyperskill.collections.which_brackets_are_balanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(isBalanced(input));
    }

    public static boolean isBalanced(String bracketsText) {
        Map<Character, Character> bracketsChars = new HashMap<>();
        bracketsChars.put('(', ')');
        bracketsChars.put('[', ']');
        bracketsChars.put('{', '}');

        if (bracketsText.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack();
        for (char bracket : bracketsText.toCharArray()) {
            if (bracketsChars.containsKey(bracket)) {
                stack.push(bracketsChars.get(bracket));
            } else if (stack.isEmpty() || bracket != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}