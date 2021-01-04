package com.miguelcaetano.hyperskill.basic_syntax.alphabetical_order;

import java.util.Scanner;

/* ITERATING OVER ARRAYS

Write a program that reads an array of lowercase strings and checks whether the array is in alphabetical
order or not.

There are some rules to compare a pair of strings a and b:

    - First chars of strings are compared: a[0] and b[0].
    - If a[0] comes earlier than b[0] in the alphabet, then a comes before b in terms of alphabetical order.
    - If the first chars are the same, then the second chars are compared, and so on.
    - If a position is reached where one string has no more chars to compare while the other does,
      then the shorter string is deemed to come first in alphabetical order.
    - Finally, identical strings are always in alphabetical order.

You can use compareTo method of the String class to compare 2 strings.
If this String object alphabetically precedes the argument string, then the result is a negative integer. The result
is a positive integer if this String object alphabetically follows the argument string. The result is zero if the
strings are identical. This is exactly what you need to compare 2 strings in terms of alphabetical order!

For example

System.out.println("abc".compareTo("acd")); // -1 "abc" < "acd"
System.out.println("abc".compareTo("aac")); //  1 "abc" > "aac"
System.out.println("abc".compareTo("abc")); //  0 "abc" = "abc"

Input data format
The single input line contains lowercase strings separated by spaces.

Output data format
Only a single word: true or false.

Sample Input 1:
a b c

Sample Output 1:
true

Sample Input 2:
a aa az aza

Sample Output 2:
true

 */

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] array = input.nextLine().split(" ");

        int size = array.length;
        boolean check = true;

        for (int i = 0; i < size - 1; i++) {
            if (array[i].compareTo(array[i + 1]) <= 0 && array[i].length() <= array[i + 1].length()) {
                check = true;
            } else {
                check = false;
            }
        }
        System.out.println(check);
    }
}