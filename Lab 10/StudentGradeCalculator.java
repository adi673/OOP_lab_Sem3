/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's roll number: ");
        String rollNumber = scanner.nextLine();
        double totalMarks = 0.0;
        boolean validInput = true;
        for (int i = 1; i <= 3; i++) 
        {
            System.out.print("Enter marks for subject " + i + ": ");
            try 
            {
                double marks = Double.parseDouble(scanner.nextLine());
                totalMarks += marks;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Error: Invalid input for marks. Please enter a valid number.");
                validInput = false;
                break;
            }
        }
        if (validInput) 
        {
            double percentage = (totalMarks / (3 * 100.0)) * 100;
            String grade;
            if (percentage >= 90) 
            {
                grade = "A+";
            } 
            else if (percentage >= 80) 
            {
                grade = "A";
            } 
            else if (percentage >= 70) 
            {
                grade = "B";
            } 
            else if (percentage >= 60) 
            {
                grade = "C";
            }
            else if (percentage >= 50)
            {
                grade = "D";
            }
            else if (percentage >= 40)
            {
                grade = "E";
            }
            else 
            {
                grade = "F";
            }
            System.out.println("\nStudent Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
        }
        scanner.close();
    }
}
