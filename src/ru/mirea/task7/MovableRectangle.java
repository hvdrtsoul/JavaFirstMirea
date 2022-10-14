package ru.mirea.task7;

import ru.mirea.task6.Movable;
import ru.mirea.task6.MovablePoint;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int a, int b, int c, int d, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(a, b, xSpeed, ySpeed);
        bottomRight = new MovablePoint(c, d, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
