package com.miguelcaetano.hyperskill.object_oriented_programming.publication_and_its_subclasses;

public class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType() + getDetails();
    }

    public String getType() {
        return "Publication: ";
    }

    public String getDetails() {
        return getTitle();
    }

    public String getTitle() {
        return title;
    }
}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    @Override
    public String getType() {
        return "Newspaper";
    }

    @Override
    public String getDetails() {
        return " (source - " + source + "): " + getTitle();
    }
}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getType() {
        return "Article";
    }

    @Override
    public String getDetails() {
        return " (author - " + getAuthor() + "): " + getTitle();
    }

    public String getAuthor() {
        return author;
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getType() {
        return "Announcement";
    }

    @Override
    public String getDetails() {
        return " (days to expire - " + getDaysToExpire() + "): " + getTitle();
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }
}
