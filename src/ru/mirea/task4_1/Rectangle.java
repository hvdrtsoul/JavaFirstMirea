package ru.mirea.task4_1;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.height = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.height = length;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String getArea() {
        return "s = a * b";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getPerimeter() {
        return "(2*(a+b))";
    }
}
