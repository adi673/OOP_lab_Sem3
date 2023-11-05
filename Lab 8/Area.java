/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author student
 */
import java.util.Scanner;

abstract class shap 
{
    abstract double calculateArea();
}

class rect extends shap 
{
    private double length;
    private double width;

    public rect(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() 
    {
        return length * width;
    }
}

class circ extends shap 
{
    private double radius;

    public circ(double radius) 
    {
        this.radius = radius;
    }

    @Override
    double calculateArea() 
    {
        return Math.PI * radius * radius;
    }
}

public class Area {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double rectLength = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double rectWidth = scanner.nextDouble();

        System.out.print("Enter radius of the circle: ");
        double circleRadius = scanner.nextDouble();

        rect rectangle = new rect(rectLength, rectWidth);
        circ circle = new circ(circleRadius);

        double rectangleArea = rectangle.calculateArea();
        double circleArea = circle.calculateArea();

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);

        scanner.close();
    }
}