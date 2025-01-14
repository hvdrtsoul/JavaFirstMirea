package ru.mirea.task30;
import java.io.Serializable;

public class Drink extends MenuItem implements Alcoholable, Serializable {
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(int cost, String name, String description, double alcoholVol, DrinkTypeEnum type) {
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        if(alcoholVol != 0)
            return true;
        return false;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }


}