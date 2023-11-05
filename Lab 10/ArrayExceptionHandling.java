/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class ArrayExceptionHandling {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        try 
        {
            System.out.print("Enter an index to access: ");
            int index = scanner.nextInt();
            int value = array[index];
            System.out.println("Value at index " + index + ": " + value);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error: Array index is out of bounds.");
            e.printStackTrace();
        } 
        finally 
        {
            scanner.close();
        }
    }
}