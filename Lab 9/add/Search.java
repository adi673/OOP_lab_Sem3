/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class Student 
{
    private int registrationNumber;
    private String firstName;
    private String lastName;
    private String degree;

    public Student(int registrationNumber, String firstName, String lastName, String degree) 
    {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    @Override
    public String toString() 
    {
        return "Registration Number: " + registrationNumber +
               "\nFirst Name: " + firstName +
               "\nLast Name: " + lastName +
               "\nDegree: " + degree + "\n";
    }
}

public class Search {
    public static void main(String[] args) 
    {
        Student[] students = new Student[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Registration Number: ");
            int regNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Degree: ");
            String degree = scanner.nextLine();

            students[i] = new Student(regNumber, firstName, lastName, degree);
        }

        System.out.print("\nEnter the search term (First Name or Last Name): ");
        String searchTerm = scanner.nextLine();

        boolean found = false;
        for (Student student : students) 
        {
            if (student.getFirstName().equalsIgnoreCase(searchTerm) || student.getLastName().equalsIgnoreCase(searchTerm)) 
            {
                System.out.println("Student found:\n" + student);
                found = true;
                break;
            }
        }

        if (!found) 
        {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}
