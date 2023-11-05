/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Bike 
{
    int speedLimit = 90;
    public void run() 
    {
        System.out.println("Bike speed limit: " + speedLimit + " km/h");
    }
}

class Splendar extends Bike 
{
    int speedLimit = 60; 
    @Override
    public void run() 
    {
        System.out.println("Splendar speed limit: " + speedLimit + " km/h");
    }
}

public class SplendarBike {
    public static void main(String[] args) 
    {
        Bike bike1 = new Bike();
        Bike splendar1 = new Splendar();
        Splendar splendar2 = new Splendar();
        System.out.println("Using Bike reference:");
        bike1.run(); 
        System.out.println("Speed limit from Bike class: " + bike1.speedLimit);
        System.out.println("\nUsing Splendar reference with Bike object:");
        splendar1.run(); 
        System.out.println("Speed limit from Bike class: " + splendar1.speedLimit);
        System.out.println("\nUsing Splendar reference:");
        splendar2.run(); 
        System.out.println("Speed limit from Splendar class: " + splendar2.speedLimit);
    }
}

