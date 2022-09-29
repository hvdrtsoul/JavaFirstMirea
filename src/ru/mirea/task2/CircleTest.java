package ru.mirea.task2;

public class CircleTest {
    public static void main(String[] args) {
        Circle testCircle = new Circle();

        testCircle.setRadius(5.0);
        testCircle.setCenterX(0);
        testCircle.setCenterY(1.2);

        System.out.println("RADIUS " + testCircle.getRadius());
        System.out.println("CENTER X " + testCircle.getCenterX());
        System.out.println("CENTER Y " + testCircle.getCenterY());
    }
}
