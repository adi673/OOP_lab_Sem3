/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class StudentDetail {
    private final String name;
    private final int id;
    private static final String collegeName = "MIT";

    public StudentDetail(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() 
    {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("College Name: " + collegeName);
    }
}

public class MITStudentRecords {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        StudentDetail[] students = new StudentDetail[numStudents];
        for (int i = 0; i < numStudents; i++) 
        {
            scanner.nextLine();
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student ID: ");
            int id = scanner.nextInt();
            students[i] = new StudentDetail(name, id);
        }
        System.out.println("\nStudent Records for MIT College:");
        System.out.println("-------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " Details:");
            students[i].displayDetails();
            System.out.println();
        }
        scanner.close();
    }
}