package com.miguelcaetano.hyperskill.collections.removing_elements;

import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        Set<String> setOfNumbers = new TreeSet<>(Arrays.asList(str.split(" ")));
        Set<Integer> setOfIntegers = new TreeSet<>();
        for (String number : setOfNumbers) {
            setOfIntegers.add(Integer.parseInt(number));
        }
        return setOfIntegers;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(str -> str > 10);
    }

}

/* Do not change code below */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}
