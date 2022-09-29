package ru.mirea.task4_1;

public class Phone {
    private final int number;
    private final String model;
    private double weight;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 1.5;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
        this.weight = 1;
        this.model = "model";
        this.number = 11111;
    }

    public void receiveCall(String name) {
        System.out.println("Calls " + name);
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(String name, int number) {
        System.out.printf("Calls %s (%d)", name, number);
        System.out.println();
    }

    public void sendMessage(int number, int... numbers) {
        System.out.println(number);
        for (int x : numbers) {
            System.out.println(x);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}