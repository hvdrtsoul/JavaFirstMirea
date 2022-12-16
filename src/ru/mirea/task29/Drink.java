package ru.mirea.task29;

public class Drink implements Item{
    private final int cost;
    private final String name;
    private final String description;

    public Drink(int cost, String name, String description) throws IllegalArgumentException{
        if (cost<0 || name.equals("") || description.equals("")) throw new IllegalArgumentException();
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
