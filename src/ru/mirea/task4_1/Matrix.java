package ru.mirea.task4_1;

public class Matrix {
    public double[][] numbers;
    public int rows;
    public int columns;

    public Matrix(double[][] numbers, int rows, int columns) {
        this.numbers = numbers;
        this.rows = rows;
        this.columns = columns;
    }

    public void multiply(int num) {
        for (int i = 0; i < this.columns; ++i) {
            for (int j = 0; j < this.rows; ++j) {
                this.numbers[i][j] *= num;
            }
        }
    }

    public void sum(Matrix matrix) {
        for (int i = 0; i < this.columns; ++i) {
            for (int j = 0; j < this.rows; ++j) {
                this.numbers[i][j] += matrix.numbers[i][j];
            }
        }
    }

    public void printOut() {
        for (int i = 0; i < this.columns; ++i) {
            for (int j = 0; j < this.rows; ++j) {
                System.out.print(numbers[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
    }
}
