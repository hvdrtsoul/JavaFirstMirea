package ru.mirea.task21;

import java.util.List;

public class SuperArray <N>{
    private final N[] array;

    public SuperArray(N[] array) {
        this.array = array;
    }
    public N get(int index) {
        return array[index];
    }
    public void printArray() {
        for (N n : array) {
            System.out.println(n);
        }
    }
    @SafeVarargs
    public final <T> void print5(T... objs) {
        List<Object> list = List.of(objs);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
