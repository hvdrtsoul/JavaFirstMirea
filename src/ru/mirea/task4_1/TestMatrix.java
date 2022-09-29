package ru.mirea.task4_1;

public class TestMatrix {
    public static void main(String[] args) {
        Matrix mat1 = new Matrix(new double[][]{{1, 28}, {6, 4}}, 2, 2);
        Matrix mat2 = new Matrix(new double[][]{{10, 223}, {20, 60}}, 2, 2);
        mat1.sum(mat2);
        mat1.printOut();
        mat1.multiply(10);
        mat1.printOut();
    }
}
