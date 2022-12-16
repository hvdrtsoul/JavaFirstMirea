package ru.mirea.task29;

public class IllegalTableNumber extends Exception{
    private String address;
    public IllegalTableNumber(String add) {
        super("Illegal number in table");
        address = add;
    }

    public String getMessage() {
        return super.getMessage() + ": " + address;
    }
}
