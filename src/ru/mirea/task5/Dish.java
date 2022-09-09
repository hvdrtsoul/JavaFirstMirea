package ru.mirea.task5;

public abstract class Dish {
    protected String color;
    protected int price;
    protected float volume;
    protected boolean isClear = true;
    protected boolean isEmpty = true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public float getVolume() {
        return volume;
    }

    public boolean isClear() {
        return isClear;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void wash(){
        this.isEmpty = true;
        this.isClear = true;
    }
}
