package com.miguelcaetano.hyperskill.functional_programming.finding_max_and_min_elements;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> listOfElements =  stream.collect(Collectors.toList());
        Optional<T> max = listOfElements.stream().max(order);
        Optional<T> min = listOfElements.stream().min(order);

        minMaxConsumer.accept(min.orElse(null), max.orElse(null));
    }
}
