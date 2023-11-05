/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

public class AutoboxingUnboxing {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int primitiveInt = scanner.nextInt();
        Integer wrapperInt = primitiveInt;

        System.out.println("Enter a double: ");
        double primitiveDouble = scanner.nextDouble();
        Double wrapperDouble = primitiveDouble;

        System.out.println("Enter a boolean (true/false): ");
        boolean primitiveBoolean = scanner.nextBoolean();
        Boolean wrapperBoolean = primitiveBoolean;

        System.out.println("Enter a character: ");
        char primitiveChar = scanner.next().charAt(0);
        Character wrapperChar = primitiveChar;

        System.out.println("Enter an Integer: ");
        Integer integerWrapper = scanner.nextInt();
        int integerPrimitive = integerWrapper;

        System.out.println("Enter a Double: ");
        Double doubleWrapper = scanner.nextDouble();
        double doublePrimitive = doubleWrapper;

        System.out.println("Enter a Boolean (true/false): ");
        Boolean booleanWrapper = scanner.nextBoolean();
        boolean booleanPrimitive = booleanWrapper;

        System.out.println("Enter a Character: ");
        Character charWrapper = scanner.next().charAt(0);
        char charPrimitive = charWrapper;

        System.out.println("\nAutoboxing and Unboxing Example:");
        System.out.println("================================");
        System.out.println("Autoboxing: int to Integer - " + wrapperInt);
        System.out.println("Autoboxing: double to Double - " + wrapperDouble);
        System.out.println("Autoboxing: boolean to Boolean - " + wrapperBoolean);
        System.out.println("Autoboxing: char to Character - " + wrapperChar);

        System.out.println("\nUnboxing: Integer to int - " + integerPrimitive);
        System.out.println("Unboxing: Double to double - " + doublePrimitive);
        System.out.println("Unboxing: Boolean to boolean - " + booleanPrimitive);
        System.out.println("Unboxing: Character to char - " + charPrimitive);

        scanner.close();
    }
}
