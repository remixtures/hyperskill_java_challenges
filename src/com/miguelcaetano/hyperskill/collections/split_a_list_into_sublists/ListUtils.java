package com.miguelcaetano.hyperskill.collections.split_a_list_into_sublists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class ListUtils {

    /**
     * It splits the passed list into a sequence of sublists with a predefined size
     */
    public static <T> List<List<T>> splitListIntoSubLists(List<T> list, int subListSize) {
        List<List<T>> subLists = new ArrayList<>();
        if (subListSize > list.size()) {
            subLists.add(list);
        } else {
            int remainingElements = list.size();
            int startIndex = 0;
            int endIndex = subListSize;
            do {
                List<T> subList = list.subList(startIndex, endIndex);
                subLists.add(subList);
                startIndex = endIndex;
                if (remainingElements - subListSize >= subListSize) {
                    endIndex = startIndex + subListSize;
                } else {
                    endIndex = startIndex + remainingElements - subList.size();
                }
                remainingElements -= subList.size();
            } while (remainingElements > 0);

        }
        return subLists;
    }
}

/* Please, do not modify code in this class */
class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String[] values = scanner.nextLine().split("\\s+");

        final List<Integer> list = Arrays.asList(values).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        final int subListSize = Integer.parseInt(scanner.nextLine());

        final List<List<Integer>> subLists = ListUtils.splitListIntoSubLists(list, subListSize);

        subLists.forEach(subList -> {
            final String representation = subList.stream().map(Object::toString).collect(Collectors.joining(" "));
            System.out.println(representation);
        });
    }
}
