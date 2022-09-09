package ru.mirea.task5;

public abstract class Dog {
    protected String name;
    protected int age;
    protected float weight;

    public Dog(String name) {
        this.name = name;
    }

    public void bark(){
        System.out.println("Bark! Bark!");
    }

    public void wigTail(){
        System.out.println(this.name + " is wigging tail");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
