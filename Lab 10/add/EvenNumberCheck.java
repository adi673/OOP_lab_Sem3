/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class EvenNumberException extends Exception {
    public EvenNumberException(String message) 
    {
        super(message);
    }
}

public class EvenNumberCheck {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (isEven(number)) 
            {
                throw new EvenNumberException("EvenNumberException: Number is even.");
            } 
            else 
            {
                System.out.println("Number is not even.");
            }
        } 
        catch (EvenNumberException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        catch (java.util.InputMismatchException e) 
        {
            System.out.println("Input Error: Please enter a valid integer.");
        } 
        finally 
        {
            scanner.close();
        }
    }

    public static boolean isEven(int number) 
    {
        return number % 2 == 0;
    }
}
