/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
class MyRunnableThread implements Runnable {
    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Runnable Thread: " + i);
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

class MyThreadThread extends Thread {
    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread Thread: " + i);
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) 
    {
        int choice;
        do 
        {
            System.out.println("\nMENU:");
            System.out.println("1. Create a thread using Runnable interface");
            System.out.println("2. Create a thread by inheriting Thread class");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = new java.util.Scanner(System.in).nextInt();

            switch (choice) 
            {
                case 1:
                    Thread runnableThread = new Thread(new MyRunnableThread());
                    runnableThread.start();
                    break;
                case 2:
                    MyThreadThread threadThread = new MyThreadThread();
                    threadThread.start();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } 
        while (choice != 3);
    }
}

