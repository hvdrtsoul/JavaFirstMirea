package ru.mirea.task2;

public class TestDish {
    public static void main(String[] args) {
        Plate plateTest = new Plate();
        Glass glassTest = new Glass();

        System.out.println("Is plate empty? " + plateTest.isEmpty);
        System.out.println("Is glass empty? " + glassTest.isEmpty);

        plateTest.putFood("corba");
        glassTest.pourLiquid("ayran");

        System.out.println("But now...");
        System.out.println("Is plate empty? " + plateTest.isEmpty);
        System.out.println("Is glass empty? " + glassTest.isEmpty);

        System.out.println("Food inside plate is " + plateTest.getFoodInside());
        System.out.println("Liquid inside glass is " + glassTest.getLiquidInside());

        plateTest.wash();
        glassTest.wash();

        System.out.println("After washing...");
        System.out.println("Is plate empty? " + plateTest.isEmpty);
        System.out.println("Is glass empty? " + glassTest.isEmpty);
    }
}
