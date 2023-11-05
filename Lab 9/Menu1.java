/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class Menu1 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        while (true) 
        {
            System.out.println("\nChoose an operation:");
            System.out.println("a. Check whether it is a palindrome");
            System.out.println("b. Write in alphabetical order");
            System.out.println("c. Reverse the string");
            System.out.println("d. Concatenate with the reversed string");
            System.out.println("e. Exit");

            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);

            switch (choice) 
            {
                case 'a':
                    boolean isPalindrome = isPalindrome(inputString);
                    System.out.println("Is Palindrome: " + isPalindrome);
                    break;

                case 'b':
                    String alphabeticallyOrderedString = alphabetizeString(inputString);
                    System.out.println("Alphabetically Ordered String: " + alphabeticallyOrderedString);
                    break;

                case 'c':
                    String reversedString = reverseString(inputString);
                    System.out.println("Reversed String: " + reversedString);
                    break;

                case 'd':
                    String concatenatedString = inputString + reverseString(inputString);
                    System.out.println("Concatenated String: " + concatenatedString);
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

    private static boolean isPalindrome(String str) 
    {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static String alphabetizeString(String str) 
    {
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }

    private static String reverseString(String str) 
    {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}

