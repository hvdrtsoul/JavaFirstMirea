package ru.mirea.task5;

import ru.mirea.task2.Alabai;
import ru.mirea.task2.JackRusselTerrier;

public class TestDog {
    public static void main(String[] args) {
        Alabai alabaiTest = new Alabai("Richard");
        JackRusselTerrier jackRusselTerrierTest = new JackRusselTerrier("Cherry");

        alabaiTest.bark();
        jackRusselTerrierTest.bark();
    }
}
