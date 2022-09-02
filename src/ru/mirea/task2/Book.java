package ru.mirea.task2;

public class Book {

    private String name;
    private String authorName;
    private int pagesNumber;

    Book(String name, String authorName, int pagesNumber) {
        this.name = name;
        this.authorName = authorName;
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() {
        return "Book named " + name + " written by " + authorName + " contains " + pagesNumber + " pages";
    }
}
