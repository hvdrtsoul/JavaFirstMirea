package ru.mirea.task2;

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
    }
}
