package com.miguelcaetano.hyperskill.generics.writing_a_class;

class Shelf<T extends Book> {

    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

class Book {
}

class Brochure extends Book {

    private String name;

    Brochure(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}

class Main {

    public static void main(String[] args) {
        Brochure brochure = new Brochure("NewBrochure");
        Shelf<Brochure> shelf = new Shelf<>();
        shelf.setElement(brochure);
        System.out.println(shelf.getElement().getName());
    }
}