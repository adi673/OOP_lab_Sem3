/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class Count {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int charCount = input.length();
        int wordCount = countWords(input);
        int lineCount = countLines(input);
        int vowelCount = countVowels(input);

        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
        System.out.println("Vowel count: " + vowelCount);

        scanner.close();
    }

    private static int countWords(String input) 
    {
        String[] words = input.split("\\s+");
        return words.length;
    }

    private static int countLines(String input) 
    {
        String[] lines = input.split("\n");
        return lines.length;
    }

    private static int countVowels(String input) 
    {
        int count = 0;
        String lowercaseInput = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = lowercaseInput.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                count++;
            }
        }
        return count;
    }
}
