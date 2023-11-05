/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class FiveLetter {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-letter word: ");
        String fiveLetterWord = scanner.nextLine().toLowerCase();

        if (fiveLetterWord.length() == 5) 
        {
            generateThreeLetterWords(fiveLetterWord);
        } 
        else 
        {
            System.out.println("Please enter a valid five-letter word.");
        }

        scanner.close();
    }

    public static void generateThreeLetterWords(String word) 
    {
        int wordLength = word.length();

        if (wordLength < 3) 
        {
            System.out.println("The word should have at least 3 unique characters.");
            return;
        }

        System.out.println("Three-letter words that can be derived from '" + word + "':");

        for (int i = 0; i < wordLength; i++) 
        {
            for (int j = 0; j < wordLength; j++) 
            {
                for (int k = 0; k < wordLength; k++) 
                {
                    if (i != j && i != k && j != k) 
                    {
                        String threeLetterWord = "" + word.charAt(i) + word.charAt(j) + word.charAt(k);
                        System.out.println(threeLetterWord);
                    }
                }
            }
        }
    }
}
