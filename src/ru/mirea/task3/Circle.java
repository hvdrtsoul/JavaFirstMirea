package ru.mirea.task3;

public class Circle {
    private double radius, centerX, centerY;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centerX=" + centerX +
                ", centerY=" + centerY +
                '}';
    }
}
