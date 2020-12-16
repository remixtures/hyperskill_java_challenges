package com.miguelcaetano.hyperskill.io_streams.convert_to_bytes;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        int storeData = inputStream.read();
        while (storeData != -1) {
            System.out.print(storeData);
            storeData = inputStream.read();
        }
        inputStream.close();
    }
}
