/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
//Output formating is wrong
import java.util.Scanner;

class matrix {
    private int[][] matrix;
    private int rows;
    private int columns;

    public matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    public void inputMatrixData(Scanner scanner) {
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayTranspose() {
        System.out.println("Transpose of the Matrix:");
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayMaxValue() {
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum value in the Matrix: " + max);
    }

    public void displayPrincipalDiagonal() {
        System.out.println("Principal Diagonal elements:");
        for (int i = 0; i < Math.min(rows, columns); i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    public void displayNonDiagonal() {
        System.out.println("Non-Diagonal elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i != j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}

public class MatrixProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();

        matrix matrix = new matrix(rows, columns);
        matrix.inputMatrixData(scanner);

        // Thread for displaying the matrix
        Thread t1 = new Thread(() -> {
            matrix.displayMatrix();
        });

        // Thread for displaying the transpose of the matrix
        Thread t2 = new Thread(() -> {
            matrix.displayTranspose();
        });

        // Thread for displaying the maximum value in the matrix
        Thread t3 = new Thread(() -> {
            matrix.displayMaxValue();
        });

        // Thread for displaying the principal diagonal elements
        Thread t4 = new Thread(() -> {
            matrix.displayPrincipalDiagonal();
        });

        // Thread for displaying the non-diagonal elements
        Thread t5 = new Thread(() -> {
            matrix.displayNonDiagonal();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        scanner.close();
    }
}
