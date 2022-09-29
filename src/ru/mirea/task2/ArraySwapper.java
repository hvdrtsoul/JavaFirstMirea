package ru.mirea.task2;

public class ArraySwapper {
    public String[] array;

    public void swapArray(){
        for(int i = 0;i < array.length/2;++i){
            String tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }
}
