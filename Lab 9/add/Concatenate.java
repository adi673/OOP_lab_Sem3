/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[5];

        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        StringBuilder result = new StringBuilder();
        for (String str : strings) 
        {
            result.append(str);
        }

        System.out.println("\nConcatenated String: " + result.toString());

        scanner.close();
    }
}

