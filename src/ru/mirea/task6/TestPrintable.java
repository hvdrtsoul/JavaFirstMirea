package ru.mirea.task6;

import java.util.ArrayList;
import java.util.List;

public class TestPrintable {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1"));
        books.add(new Book("Book2"));
        books.add(new Book("Book3"));

        for (Book book:
             books) {
            book.print();
        }
    }


}
