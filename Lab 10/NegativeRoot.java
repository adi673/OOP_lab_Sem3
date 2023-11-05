/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) 
    {
        super(message);
    }
}

public class NegativeRoot {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            if (number < 0) 
            {
                throw new NegativeNumberException("Negative square root is not defined for negative numbers.");
            }
            double sqrt = Math.sqrt(number);
            System.out.println("Square root of " + number + " is: " + sqrt);
        } 
        catch (NegativeNumberException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (java.util.InputMismatchException e) 
        {
            System.out.println("Input Error: Please enter a valid number.");
        } 
        finally 
        {
            scanner.close();
        }
    }
}