 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the replacement characters: ");
        String replacementChars = scanner.nextLine();

        String resultString = replaceWordWithRepeatingChars(inputString, wordToReplace, replacementChars);

        System.out.println("Result: " + resultString);

        scanner.close();
    }

    private static String replaceWordWithRepeatingChars(String input, String wordToReplace, String replacementChars) 
    {
        StringBuilder result = new StringBuilder();
        int wordToReplaceLength = wordToReplace.length();
        int inputLength = input.length();

        for (int i = 0; i < inputLength; ) 
        {
            if (i <= inputLength - wordToReplaceLength && input.substring(i, i + wordToReplaceLength).equals(wordToReplace)) 
            {
                result.append(replacementChars);
                i += wordToReplaceLength;
            } 
            else 
            {
                result.append(input.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
