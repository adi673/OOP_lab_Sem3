/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author student
 */
import java.util.Scanner;

interface shape 
{
    double calculateArea();
}

class rectangle implements shape 
{
    private double length;
    private double width;

    public rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() 
    {
        return length * width;
    }
}

class circle implements shape 
{
    private double radius;

    public circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea() 
    {
        return Math.PI * radius * radius;
    }
}

public class AreaInterface {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double rectLength = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double rectWidth = scanner.nextDouble();

        System.out.print("Enter radius of the circle: ");
        double circleRadius = scanner.nextDouble();

        shape rectangle = new rectangle(rectLength, rectWidth);
        shape circle = new circle(circleRadius);

        double rectangleArea = rectangle.calculateArea();
        double circleArea = circle.calculateArea();

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);

        scanner.close();
    }
}

