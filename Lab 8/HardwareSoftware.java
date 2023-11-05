/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author student
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Product 
{
    double calculateSales();
}

class Hardware implements Product 
{
    private String category;
    private String manufacturer;
    private double sales;

    public Hardware(String category, String manufacturer, double sales) 
    {
        this.category = category;
        this.manufacturer = manufacturer;
        this.sales = sales;
    }

    @Override
    public double calculateSales() 
    {
        return sales;
    }
}

class Software implements Product 
{
    private String type;
    private String operatingSystem;
    private double sales;

    public Software(String type, String operatingSystem, double sales) 
    {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.sales = sales;
    }

    @Override
    public double calculateSales() 
    {
        return sales;
    }
}

public class HardwareSoftware {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        while (true) 
        {
            System.out.print("\nEnter product type (hardware/software) or 'quit' to finish: ");
            String productType = scanner.nextLine().toLowerCase();

            if (productType.equals("quit")) 
            {
                break;
            }

            System.out.print("Enter product category/type: ");
            String category = scanner.nextLine();

            System.out.print("Enter manufacturer/operating system: ");
            String manufacturerOrOS = scanner.nextLine();

            System.out.print("Enter sales for the last 3 months: ");
            double sales = Double.parseDouble(scanner.nextLine());

            if (productType.equals("hardware")) 
            {
                products.add(new Hardware(category, manufacturerOrOS, sales));
            } 
            else if (productType.equals("software")) 
            {
                products.add(new Software(category, manufacturerOrOS, sales));
            } 
            else 
            {
                System.out.println("Invalid product type. Please enter 'hardware' or 'software'.");
            }
        }

        double totalHardwareSales = 0.0;
        double totalSoftwareSales = 0.0;

        for (Product product : products) 
        {
            if (product instanceof Hardware) 
            {
                totalHardwareSales += product.calculateSales();
            } 
            else if (product instanceof Software) 
            {
                totalSoftwareSales += product.calculateSales();
            }
        }

        System.out.println("Total Hardware Sales (Last 3 Months): " + totalHardwareSales);
        System.out.println("Total Software Sales (Last 3 Months): " + totalSoftwareSales);

        scanner.close();
    }
}

