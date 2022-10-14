package ru.mirea.task7;

public class TestSuperString {
    public static void main(String[] args) {
        SuperString superString = new SuperString();
        superString.value = "ABCD";

        System.out.println(superString.countSymbols());
        System.out.println(superString.getUnevenSymbols());
        System.out.println(superString.reverseString());
    }
}
