package ru.mirea.task4_1;

class VehicleTest {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Plane plane = new Plane();
        Train train = new Train();
        Ship ship = new Ship();
        int path = 3000;
        plane.ticketCost(path);
        plane.tripTime(path);
        auto.ticketCost(path);
        auto.tripTime(path);
        train.ticketCost(path);
        train.tripTime(path);
        ship.ticketCost(path);
        ship.tripTime(path);
    }
}