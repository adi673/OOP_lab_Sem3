/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

abstract class Shape 
{
    abstract double calculateArea();
}

class Square extends Shape 
{
    private double side;

    public Square(double side) 
    {
        this.side = side;
    }

    @Override
    double calculateArea() 
    {
        return side * side;
    }
}

class Triangle extends Shape 
{
    private double base;
    private double height;

    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() 
    {
        return 0.5 * base * height;
    }
}

public class Area {
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

