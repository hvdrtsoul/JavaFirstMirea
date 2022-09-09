package ru.mirea.task5;

public abstract class Furniture {
    protected String color;
    protected float height;
    protected float width;
    protected int price;
    protected int assemblyDifficultyLevel;

    abstract void printInfo();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAssemblyDifficultyLevel() {
        return assemblyDifficultyLevel;
    }

    public void setAssemblyDifficultyLevel(int assemblyDifficultyLevel) {
        this.assemblyDifficultyLevel = assemblyDifficultyLevel;
    }
}
