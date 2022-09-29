package ru.mirea.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape testShape = new Shape();
        testShape.setHeight(10);
        Tester.printObjectInfo(testShape);

        Ball testBall = new Ball("blue", 32.2);
        Tester.printObjectInfo(testBall);

        Book testBook = new Book("Bir Derdim Var", "mor ve otesi", 324);
        Tester.printObjectInfo(testBook);

        Dog testDog = new Dog("Strawberry", 2);
        System.out.println("Human age of " + testDog.getName() + " is " + testDog.getHumanAge());
        Tester.printObjectInfo(testDog);

        TestDog testTestDog = new TestDog();
        testTestDog.addDog(testDog);

        ArraySwapper arraySwapper = new ArraySwapper();
        String[] testArray = {"Glitter", "shines", "diamond"};

        arraySwapper.array = testArray;
        arraySwapper.swapArray();

        for(String s : arraySwapper.array)
            System.out.println(s);

        PokerCropie pokerCropie = new PokerCropie();
        pokerCropie.shuffle();

        System.out.println("How many people?");
        Scanner input = new Scanner(System.in);

        int peopleNumber = input.nextInt();
        pokerCropie.giveCards(peopleNumber);

        HowMany howMany = new HowMany();
        howMany.countWords();
    }
}
