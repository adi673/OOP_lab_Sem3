/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) 
    {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age < 0) 
            {
                throw new CustomException("Age cannot be negative.");
            }
            System.out.println("Your age is: " + age);
        } 
        catch (CustomException e) 
        {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } 
        catch (java.util.InputMismatchException e) 
        {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } 
        finally 
        {
            scanner.close();
        }
    }
}

