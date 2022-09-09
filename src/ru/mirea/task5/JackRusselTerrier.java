package ru.mirea.task5;

public class JackRusselTerrier extends Dog{

    public JackRusselTerrier(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("Woof! Woof! I am jack russel terrier!");
    }
}
