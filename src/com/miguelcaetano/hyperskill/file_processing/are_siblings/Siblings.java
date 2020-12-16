package com.miguelcaetano.hyperskill.file_processing.are_siblings;

import java.io.File;

public class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        return f1.getParent().equals(f2.getParent());
    }
}