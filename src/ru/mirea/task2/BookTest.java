package ru.mirea.task2;

import ru.mirea.task3.Book;

public class BookTest {
    public static void main(String[] args) {
        ru.mirea.task3.Book testBook = new Book("Cakkidi", "Kenan Dooulu");

        System.out.println("Setting book ISBN to new value...");
        testBook.setIsbn("1245BS23AE");
        System.out.println("Setting pages number of the book to 318...");
        testBook.setPageNumbers(318);
        System.out.println("Publishing book in 2022...");
        testBook.setPublishYear(2022);

        System.out.println("Book named " + testBook.getName() + " by " + testBook.getAuthorName() + " containing " +
                testBook.getPageNumbers() + " pages was published in " + testBook.getPublishYear() + " with ISBN " + testBook.getIsbn());

    }
}
