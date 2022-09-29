package ru.mirea.task4_1;

public abstract class Vehicle {
    protected double speed;
    protected double cost;

    public void ticketCost(int road) {
        System.out.println(getClass().getSimpleName() + ". Ticket price: " + (road / speed) * cost);
    }

    public void tripTime(int road) {
        System.out.println(getClass().getSimpleName()  + ". Time in the road: " + (road / speed));
    }
}
