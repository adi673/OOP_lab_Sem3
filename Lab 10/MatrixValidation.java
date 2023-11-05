/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class InvalidMatrixException extends Exception {
    public InvalidMatrixException(String message) 
    {
        super(message);
    }
}

public class MatrixValidation {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();
            int[][] matrix = new int[rows][columns];
            if (isSquareMatrix(matrix)) 
            {
                System.out.println("It's a square matrix.");
            } 
            else 
            {
                throw new InvalidMatrixException("It's not a square matrix.");
            }
        } 
        catch (InvalidMatrixException e) 
        {
            System.out.println("Matrix Validation Error: " + e.getMessage());
        } 
        catch (java.util.InputMismatchException e) 
        {
            System.out.println("Input Error: Please enter valid integers for rows and columns.");
        } 
        finally 
        {
            scanner.close();
        }
    }

    public static boolean isSquareMatrix(int[][] matrix) 
    {
        int rows = matrix.length;
        int columns = matrix[0].length;
        return rows == columns;
    }
}