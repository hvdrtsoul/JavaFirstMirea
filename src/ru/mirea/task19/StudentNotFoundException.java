package ru.mirea.task19;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException() {
        super("Error: Student not found");
    }

    public boolean getMessageRenamed() {
        return false;
    }
}
