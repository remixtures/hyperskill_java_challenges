package com.miguelcaetano.hyperskill.object_oriented_programming.book_ii;

public class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String[] getAuthors() {
        return authors.clone();
    }

    public void setAuthors(String[] authors) {
        this.authors = authors.clone();
    }
}
