package ru.mirea.task30;

import java.io.Serializable;
import java.util.Objects;

public class MenuItem implements Serializable {
    private int cost;
    private String name;
    private String description ;

    public MenuItem(int cost, String name, String description) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem item = (MenuItem) o;
        return cost == item.cost && name.equals(item.name) && description.equals(item.description);
    }

    public String getInfo(){
        return name + ", " + description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, name, description);
    }
}