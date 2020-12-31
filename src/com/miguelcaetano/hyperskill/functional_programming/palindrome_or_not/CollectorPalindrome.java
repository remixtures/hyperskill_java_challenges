package com.miguelcaetano.hyperskill.functional_programming.palindrome_or_not;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<Boolean, List<String>> palindromeOrNo = Arrays.stream(words)
                .collect(Collectors.partitioningBy(a -> a.equals(new StringBuilder(a).reverse().toString())));

        palindromeOrNo = new LinkedHashMap<>(palindromeOrNo);

        System.out.println(palindromeOrNo);
    }
}
