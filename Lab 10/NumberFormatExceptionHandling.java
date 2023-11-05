/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class NumberFormatExceptionHandling {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String input = scanner.nextLine();
        try 
        {
            int number = Integer.parseInt(input);
            System.out.println("Successfully converted to an integer: " + number);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Error: Invalid conversion. Please enter a valid integer string.");
        } 
        finally 
        {
            scanner.close();
        }
    }
}