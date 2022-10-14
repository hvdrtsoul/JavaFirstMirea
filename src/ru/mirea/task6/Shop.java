package ru.mirea.task6;

public class Shop implements Printable{
    public String name;

    @Override
    public void print() {
        System.out.println(name);
    }
}
