package com.miguelcaetano.hyperskill.object_oriented_programming.compact_string_with_asciicharsequence;

import java.util.*;

public class AsciiCharSequence implements CharSequence {
    // implementation
    private byte[] sequenceOfChars;

    public AsciiCharSequence(byte[] sequenceOfChars) {
        this.sequenceOfChars = sequenceOfChars.clone();
    }

    @Override
    public int length() {
        return sequenceOfChars.length;
    }

    @Override
    public char charAt(int index) {
        return (char) sequenceOfChars[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(sequenceOfChars, start, end));
    }

    @Override
    public String toString() {
        return new String(sequenceOfChars);
    }
}
