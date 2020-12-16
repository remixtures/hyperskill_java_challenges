package com.miguelcaetano.hyperskill.io_streams.convert_to_char_array;

import java.io.CharArrayWriter;
import java.io.IOException;

public class Converter {
    public static char[] convert(String[] words) throws IOException {
        CharArrayWriter writer = new CharArrayWriter();
        for (String word : words) {
            writer.append(word);
        }
        return writer.toCharArray();
    }
}