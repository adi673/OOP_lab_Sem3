/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.ArrayList;
import java.util.Scanner;

class Student 
{
    private int regnum;
    private String name;
    private int age;

    public Student(int regnum, String name, int age) 
    {
        this.regnum = regnum;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() 
    {
        System.out.println("Reg.No.: " + regnum);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class UGStudent extends Student 
{
    private int semester;
    private double fees;

    public UGStudent(int regnum, String name, int age, int semester, double fees) 
    {
        super(regnum, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

class PGStudent extends Student 
{
    private int semester;
    private double fees;

    public PGStudent(int regnum, String name, int age, int semester, double fees) 
    {
        super(regnum, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

public class Admission {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int totalUGAdmissions = 0;
        int totalPGAdmissions = 0;
        while (true) 
        {
            System.out.println("\nChoose Student Category:");
            System.out.println("1. UG Student");
            System.out.println("2. PG Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Reg.No.: ");
                    int regNumUG = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter Name: ");
                    String nameUG = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int ageUG = scanner.nextInt();
                    System.out.print("Enter Semester: ");
                    int semesterUG = scanner.nextInt();
                    System.out.print("Enter Fees: ");
                    double feesUG = scanner.nextDouble();
                    UGStudent ugStudent = new UGStudent(regNumUG, nameUG, ageUG, semesterUG, feesUG);
                    students.add(ugStudent);
                    totalUGAdmissions++;
                    break;

                case 2:
                    System.out.print("Enter Reg.No.: ");
                    int regNumPG = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter Name: ");
                    String namePG = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int agePG = scanner.nextInt();
                    System.out.print("Enter Semester: ");
                    int semesterPG = scanner.nextInt();
                    System.out.print("Enter Fees: ");
                    double feesPG = scanner.nextDouble();
                    PGStudent pgStudent = new PGStudent(regNumPG, namePG, agePG, semesterPG, feesPG);
                    students.add(pgStudent);
                    totalPGAdmissions++;
                    break;

                case 3:
                    System.out.println("UG Students:");
                    for (Student student : students) 
                    {
                        if (student instanceof UGStudent) 
                        {
                            student.displayDetails();
                        }
                    }
                    System.out.println("Total UG Admissions: " + totalUGAdmissions);
                    System.out.println("\nPG Students:");
                    for (Student student : students) 
                    {
                        if (student instanceof PGStudent) 
                        {
                            student.displayDetails();
                        }
                    }
                    System.out.println("Total PG Admissions: " + totalPGAdmissions);
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
