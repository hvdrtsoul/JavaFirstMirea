package ru.mirea.task6;

public class FarenTemp implements Convertable{
    float temp;

    public FarenTemp(float temp) {
        this.temp = temp;
    }

    @Override
    public float convert() {
        return this.temp * 9f / 5f + 32;
    }
}
