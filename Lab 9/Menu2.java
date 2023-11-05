/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        while (true) 
        {
            System.out.println("\nChoose an operation:");
            System.out.println("a. Compare two strings");
            System.out.println("b. Convert uppercase to lowercase and vice-versa");
            System.out.println("c. Check if one string is a substring of the other");
            System.out.println("d. Replace substring with 'Hello'");
            System.out.println("e. Exit");

            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);

            switch (choice) 
            {
                case 'a':
                    boolean areEqual = compareStrings(firstString, secondString);
                    System.out.println("Strings are equal: " + areEqual);
                    break;

                case 'b':
                    firstString = toggleCase(firstString);
                    secondString = toggleCase(secondString);
                    System.out.println("First String after case conversion: " + firstString);
                    System.out.println("Second String after case conversion: " + secondString);
                    break;

                case 'c':
                    boolean isSubstring = isSubstring(firstString, secondString);
                    System.out.println("Is one string a substring of the other: " + isSubstring);
                    break;

                case 'd':
                    if (isSubstring(firstString, secondString)) 
                    {
                        firstString = replaceSubstringWithHello(firstString, secondString);
                        System.out.println("First String after replacement: " + firstString);
                    } 
                    else 
                    {
                        System.out.println("Second string is not a substring of the first string.");
                    }
                    break;

                case 'e':
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static boolean compareStrings(String str1, String str2) 
    {
        return str1.equals(str2);
    }

    private static String toggleCase(String str) 
    {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) 
        {
            if (Character.isUpperCase(c)) 
            {
                result.append(Character.toLowerCase(c));
            } 
            else if (Character.isLowerCase(c)) 
            {
                result.append(Character.toUpperCase(c));
            } 
            else 
            {
                result.append(c);
            }
        }

        return result.toString();
    }

    private static boolean isSubstring(String str1, String str2) 
    {
        return str1.contains(str2) || str2.contains(str1);
    }

    private static String replaceSubstringWithHello(String str1, String str2) 
    {
        return str1.replace(str2, "Hello");
    }
}
