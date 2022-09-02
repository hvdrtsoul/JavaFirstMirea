package ru.mirea.task2;

import java.util.ArrayList;
import java.util.List;

public class TestDog {

    private ArrayList<Dog> dogs;
    TestDog(){
        dogs = new ArrayList<>();
    }

    public void addDog(Dog input){
        dogs.add(input);
    }

    public void addDog(Dog[] input){
        dogs.addAll(List.of(input));
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }
}
