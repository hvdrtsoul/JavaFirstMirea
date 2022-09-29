package ru.mirea.task2;

public class Head {
    private String eyeColor;
    private double height, width;
    private int noseType;
    private boolean eyesClosed;

    public void closeEyes(){
        eyesClosed = true;
    }

    public void openEyes(){
        eyesClosed = false;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getNoseType() {
        return noseType;
    }

    public void setNoseType(int noseType) {
        this.noseType = noseType;
    }


}
