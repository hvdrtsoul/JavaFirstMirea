package ru.mirea.task2;

import ru.mirea.task5.Dog;

public class JackRusselTerrier extends Dog {

    public JackRusselTerrier(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("Woof! Woof! I am jack russel terrier!");
    }
}
