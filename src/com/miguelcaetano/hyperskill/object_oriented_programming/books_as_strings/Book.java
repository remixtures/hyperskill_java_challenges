package com.miguelcaetano.hyperskill.object_oriented_programming.books_as_strings;

import java.util.Arrays;

public class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors.clone();
    }

    @Override
    public String toString() {
        return "title=" + title +
                ",yearOfPublishing=" + yearOfPublishing +
                ",authors=" + Arrays.toString(authors).replace(", ", ",");
    }
}
