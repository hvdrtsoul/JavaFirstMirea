package ru.mirea.task2;

public class Ball {
    private String colour;
    private double flexibility;

    Ball(String colour, double flexibility){
        this.colour = colour;
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
        return "Ball coloured " + colour + " with " + flexibility + " flexibility";
    }
}
