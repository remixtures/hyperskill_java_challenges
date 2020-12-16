package com.miguelcaetano.hyperskill.object_oriented_programming.book;

import java.util.Arrays;

public class Book {

    String title;
    int yearOfPublishing;
    String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;

        if (authors == null) {
            this.authors = new String[0];
        } else {
            this.authors = Arrays.copyOf(authors, authors.length);
        }
    }
}
