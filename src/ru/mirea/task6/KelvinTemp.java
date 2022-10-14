package ru.mirea.task6;

public class KelvinTemp implements Convertable{
    float temp;

    public KelvinTemp(float temp) {
        this.temp = temp;
    }

    @Override
    public float convert() {
        return this.temp + 273f;
    }
}
