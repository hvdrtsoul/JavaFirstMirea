package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args) throws InterruptedException {
        Human testHuman = new Human();

        System.out.println("Eyes color is " + testHuman.getHead().getEyeColor());
        System.out.println("Left leg height is " + testHuman.getLeftLeg().getHeight());

        System.out.println("Making human blink...");
        testHuman.getHead().closeEyes();
        Thread.sleep(1000);
        testHuman.getHead().openEyes();
        System.out.println("Human just blinked");
    }
}
