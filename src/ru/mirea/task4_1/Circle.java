package ru.mirea.task4_1;

public class Circle extends Shape {
    private double r;

    public Circle() {

    }

    public Circle(double radius) {
        this.r = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.r = radius;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String getArea() {
        return "s = pi*R^2";
    }

    @Override
    public String getPerimeter() {
        return "p = 2*pi*R";
    }
}