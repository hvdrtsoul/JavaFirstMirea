package ru.mirea.task2;

public class Shape {
    private int height;
    private int width;

    Shape(){
        height = 0;
        width = 0;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Shape with " + height + " height and " + width + " width";
    }
}
