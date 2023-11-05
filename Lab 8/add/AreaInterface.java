/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

interface Shape1 
{
    double calculateArea();
}

class Square1 implements Shape1 
{
    private double side;

    public Square1(double side) 
    {
        this.side = side;
    }

    @Override
    public double calculateArea() 
    {
        return side * side;
    }
}

class Triangle1 implements Shape1 
{
    private double base;
    private double height;

    public Triangle1(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() 
    {
        return 0.5 * base * height;
    }
}

public class AreaInterface {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);

        System.out.print("Enter the base length of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleBase, triangleHeight);

        double squareArea = square.calculateArea();
        double triangleArea = triangle.calculateArea();

        System.out.println("Area of the square: " + squareArea);
        System.out.println("Area of the triangle: " + triangleArea);

        scanner.close();
    }
}

