package ru.mirea.task6;

public class Book implements Printable{
    public String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
