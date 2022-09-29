package ru.mirea.task2;

import ru.mirea.task5.Dog;

public class Alabai extends Dog {

    public Alabai(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("WOOFFFF! WOFFF! I AM ALABAI!!!");
    }
}
