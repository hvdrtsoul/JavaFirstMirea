package ru.mirea.task2;

public class Plate{

    private float width;
    private String foodInside;

    public void putFood(String foodName) {
        this.foodInside = foodName;
        this.isEmpty = false;
        this.isClear = false;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public String getFoodInside() {
        return foodInside;
    }
}
