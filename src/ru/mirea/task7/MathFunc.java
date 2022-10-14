package ru.mirea.task7;

public class MathFunc implements MathCalculate{

    @Override
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double complexAbs(double real, double imaginary) {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    public double countC(double radius){
        return 2 * PI * radius;
    }

}
