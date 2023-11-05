/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class TelephoneNumber {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a telephone number in the format (555) 555-5555: ");
        String phoneNumber = scanner.nextLine();

        if (phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")) 
        {
            String areaCode = phoneNumber.substring(1, 4);
            String firstThreeDigits = phoneNumber.substring(6, 9);
            String lastFourDigits = phoneNumber.substring(10);

            System.out.println("Area Code: " + areaCode);
            System.out.println("Seven-Digit Phone Number: " + firstThreeDigits + "-" + lastFourDigits);
        } 
        else 
        {
            System.out.println("Invalid telephone number format. Please use (555) 555-5555 format.");
        }

        scanner.close();
    }
}
