package ru.mirea.task19;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Error: Empty string not allowed");
    }
}
