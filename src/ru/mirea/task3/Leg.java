package ru.mirea.task3;

public class Leg {
    private boolean isDown;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void putUp(){
        isDown = false;
    }

    public void putDown(){
        isDown = true;
    }
}
