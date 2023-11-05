/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class NegativeArraySizeException {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            if (size < 0) 
            {
                System.out.println("Error: Array size cannot be negative.");
            } 
            else 
            {
                int[] array = new int[size];
                System.out.println("Array created with size: " + size);
            }
        } 
        catch (java.util.InputMismatchException e) 
        {
            System.out.println("Input Error: Please enter a valid integer for the array size.");
        } 
        finally 
        {
            scanner.close();
        }
    }
}

