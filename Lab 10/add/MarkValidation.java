/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class MarkOutOfBoundsException extends Exception {
    public MarkOutOfBoundsException(String message) 
    {
        super(message);
    }
}

class Student 
{
    private String name;
    private int mark;

    public Student(String name, int mark) 
    {
        this.name = name;
        this.mark = mark;
    }

    public void validateMark() throws MarkOutOfBoundsException 
    {
        if (mark < 0 || mark > 100) 
        {
            throw new MarkOutOfBoundsException("Mark is out of bounds. Marks should be between 0 and 100.");
        }
    }

    public String getName() 
    {
        return name;
    }

    public int getMark() 
    {
        return mark;
    }
}

public class MarkValidation {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
            System.out.print("Enter the student's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter the student's mark: ");
            int mark = scanner.nextInt();
            Student student = new Student(name, mark);
            student.validateMark();
            System.out.println("Name: " + student.getName());
            System.out.println("Mark: " + student.getMark());
        } 
        catch (MarkOutOfBoundsException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        catch (java.util.InputMismatchException e) 
        {
            System.out.println("Input Error: Please enter a valid name and integer mark.");
        } 
        finally 
        {
            scanner.close();
        }
    }
}
