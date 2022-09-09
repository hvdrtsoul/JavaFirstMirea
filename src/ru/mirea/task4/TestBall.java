package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball firstBall = new Ball();
        Ball secondBall = new Ball(2.0, 3.5);

        System.out.println("First ball is " + firstBall);
        System.out.println("Second ball is " + secondBall);

        firstBall.move(3.4, 8.7);
        secondBall.move(-2.3, 11.0);

        System.out.println("Balls just moved...");

        System.out.println("Now first ball is " + firstBall);
        System.out.println("Now second ball is " + secondBall);
    }
}
