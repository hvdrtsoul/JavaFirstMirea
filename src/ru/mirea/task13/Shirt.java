package ru.mirea.task13;

import java.util.StringTokenizer;

public class Shirt {
    private String s;
    private String title;
    private String color;
    private String size;

    public Shirt(String description){
        StringTokenizer parts = new StringTokenizer(description, ",");
        this.s = parts.nextToken();
        this.title = parts.nextToken();
        this.color = parts.nextToken();
        this.size = parts.nextToken();
    }

    @Override
    public String toString() {
        return "Shirt with S" + this.s +
                " Named " + this.title +
                " Size " + this.size +
                " Color " + this.color;
    }
}
