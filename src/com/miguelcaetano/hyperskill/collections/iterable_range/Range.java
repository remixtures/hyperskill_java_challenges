package com.miguelcaetano.hyperskill.collections.iterable_range;

import java.util.Iterator;

public class Range implements Iterable<Long> {

    private long fromInclusive;
    private long toExclusive;

    public Range(long from, long to) {
        this.fromInclusive = from;
        this.toExclusive = to;
    }

    @Override
    public Iterator<Long> iterator() {

        return new Iterator<>() {

            private long index = fromInclusive;

            @Override
            public boolean hasNext() {
                return index < toExclusive;
            }

            @Override
            public Long next() {
                return index++;
            }
        };
    }
}
