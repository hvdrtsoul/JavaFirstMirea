package ru.mirea.task3;

public class Book {
    private String name, authorName, isbn;
    private int pageNumbers, publishYear;

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }
}
