package com.miguelcaetano.hyperskill.collections.count_the_value_occurrences;

import java.util.Collections;
import java.util.List;

public class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int firstList = Collections.frequency(list1, elem);
        int secondList = Collections.frequency(list2, elem);
        return firstList == secondList;
    }
}
