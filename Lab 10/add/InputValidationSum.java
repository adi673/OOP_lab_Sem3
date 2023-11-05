/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class InputException extends Exception {
    public InputException(String message) 
    {
        super(message);
    }
}

public class InputValidationSum {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        try 
        {
            while (true) 
            {
                System.out.print("Enter a number (or -1 to calculate and exit): ");
                String input = scanner.next();
                if (input.equals("-1")) 
                {
                    break;
                }
                double number;
                try 
                {
                    number = Double.parseDouble(input);
                } 
                catch (NumberFormatException e) 
                {
                    throw new InputException("Invalid input. Please enter a valid number.");
                }
                if (number != (int) number) 
                {
                    throw new InputException("Floating point numbers are not allowed.");
                }
                sum += (int) number;
            }
            System.out.println("Sum of the entered numbers: " + sum);
        } 
        catch (InputException e) 
        {
            System.out.println("Input Error: " + e.getMessage());
        }
        scanner.close();
    }
}

