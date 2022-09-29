package ru.mirea.task2;

import ru.mirea.task4.Ball;

public class TestBall {
    public static void main(String[] args) {
        ru.mirea.task4.Ball firstBall = new ru.mirea.task4.Ball();
        ru.mirea.task4.Ball secondBall = new Ball(2.0, 3.5);

        System.out.println("First ball is " + firstBall);
        System.out.println("Second ball is " + secondBall);

        firstBall.move(3.4, 8.7);
        secondBall.move(-2.3, 11.0);

        System.out.println("Balls just moved...");

        System.out.println("Now first ball is " + firstBall);
        System.out.println("Now second ball is " + secondBall);
    }
}
