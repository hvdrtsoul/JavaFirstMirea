package ru.mirea.task21;

public class Main {


    public static void main(String[] args) {
        Integer[] intArray = {2, 3, 11, 495, 9};
        Double[] doubleArray = {1.223, 522.2, 763.3, 42.4, 59613.5};
        Character[] charArray = {'F', 'U', 'R', 'K', 'A', 'N'};

        SuperArray<Integer> intObj = new SuperArray<>(intArray);
        SuperArray<Double> doubleObj = new SuperArray<>(doubleArray);
        SuperArray<Character> charObj = new SuperArray<>(charArray);

        intObj.printArray();
        doubleObj.printArray();
        charObj.printArray();

        System.out.println(intObj.get(2));
        System.out.println(doubleObj.get(2));
        System.out.println(charObj.get(2));

        intObj.print5(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        intObj.print5('F', 'U', 'R', 'K', 'A', 'N');
    }
}
