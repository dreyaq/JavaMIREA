package Proj20;

import java.util.Arrays;

public class Matrix<T extends Number> {
    private T[][] data;
    private int rows;
    private int columns;

    public Matrix(T[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix<T> add(Matrix<T> otherMatrix) {
        if (this.rows != otherMatrix.rows || this.columns != otherMatrix.columns) {
            throw new IllegalArgumentException("Матрицы разных размеров нельзя сложить.");
        }

        T[][] result = (T[][]) new Number[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Выполняем сложение элементов матриц
                double sum = data[i][j].doubleValue() + otherMatrix.data[i][j].doubleValue();
                if (data[i][j] instanceof Double) {
                    result[i][j] = (T) Double.valueOf(sum);
                } else {
                    result[i][j] = (T) Integer.valueOf((int) sum);
                }
            }
        }

        return new Matrix<>(result);
    }

    public Matrix<T> multiply(Matrix<T> otherMatrix) {
        if (this.columns != otherMatrix.rows) {
            throw new IllegalArgumentException("Умножение матриц невозможно. Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы.");
        }

        T[][] result = (T[][]) new Number[this.rows][otherMatrix.columns];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < otherMatrix.columns; j++) {
                double sum = 0;
                for (int k = 0; k < this.columns; k++) {
                    sum += data[i][k].doubleValue() * otherMatrix.data[k][j].doubleValue();
                }
                if (data[i][0] instanceof Double) {
                    result[i][j] = (T) Double.valueOf(sum);
                } else {
                    result[i][j] = (T) Integer.valueOf((int) sum);
                }
            }
        }

        return new Matrix<>(result);
    }

    public static void main(String[] args) {
        Integer[][] data1 = {{1, 2}, {3, 4}};
        Integer[][] data2 = {{5, 6}, {7, 8}};
        Matrix<Integer> matrix1 = new Matrix<>(data1);
        Matrix<Integer> matrix2 = new Matrix<>(data2);

        System.out.println("Matrix 1:");
        matrix1.printMatrix();

        System.out.println("Matrix 2:");
        matrix2.printMatrix();

        Matrix<Integer> sumResult = matrix1.add(matrix2);
        System.out.println("Matrix 1 + Matrix 2:");
        sumResult.printMatrix();

        Matrix<Integer> productResult = matrix1.multiply(matrix2);
        System.out.println("Matrix 1 * Matrix 2:");
        productResult.printMatrix();
    }
}

