package ru.mirea.task2;

public class Glass extends Dish{

    private float height;
    private String liquidInside;

    public void pourLiquid(String liquidName){
        this.liquidInside = liquidName;
        this.isEmpty = false;
        this.isClear = false;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getLiquidInside() {
        return liquidInside;
    }
}
