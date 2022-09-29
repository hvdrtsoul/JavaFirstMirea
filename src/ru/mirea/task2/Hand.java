package ru.mirea.task2;

public class Hand {
    private boolean isDown;
    private double height;

    public void putUp(){
        isDown = false;
    }

    public void putDown(){
        isDown = true;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
