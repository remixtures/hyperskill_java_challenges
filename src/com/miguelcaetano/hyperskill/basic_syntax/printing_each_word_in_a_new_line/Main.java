package com.miguelcaetano.hyperskill.basic_syntax.printing_each_word_in_a_new_line;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstWord = input.next();
        String secondWord = input.next();
        String thirdWord = input.next();
        String fourthWord = input.next();
        String fifthWord = input.next();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        System.out.println(fourthWord);
        System.out.println(fifthWord);

        input.close();
    }
}
