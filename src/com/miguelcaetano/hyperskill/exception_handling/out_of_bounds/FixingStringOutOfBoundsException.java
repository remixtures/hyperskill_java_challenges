package com.miguelcaetano.hyperskill.exception_handling.out_of_bounds;

import java.util.*;

class FixingStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();
        try {
            System.out.println(string.charAt(index));
        }   catch (StringIndexOutOfBoundsException e) {
            System.out.println("Out of bounds!");
        }
    }
}
