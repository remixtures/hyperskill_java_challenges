package com.miguelcaetano.hyperskill.object_oriented_programming.movie;

public class Movie {
    private String title;
    private String desc;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.desc = "empty";
        this.year = year;
    }

    public Movie(String title, String desc, int year) {
        this.title = title;
        this.desc = desc;
        this.year = year;
    }
    // write two constructors here

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }
}