/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();

        scanner.nextLine();

        String[] stringArray = new String[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter string " + (i + 1) + ": ");
            stringArray[i] = scanner.nextLine();
        }

        Arrays.sort(stringArray);

        System.out.println("\nSorted strings:");

        for (String str : stringArray) 
        {
            System.out.println(str);
        }

        scanner.close();
    }
}

