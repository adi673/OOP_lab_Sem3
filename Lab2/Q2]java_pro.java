package Lab2;
import java.util.Scanner;

class byt{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read int, double, and char from the user
        System.out.print("Enter an integer number: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a double number: ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);

        // Perform conversions
        byte intToByteValue = (byte) intValue;
        int charToIntValue = (int) charValue;
        byte doubleToByteValue = (byte) doubleValue;

        // Print the results
        System.out.println("Integer to byte: " + intToByteValue);
        System.out.println("Character to int: " + charToIntValue);
        System.out.println("Double to byte: " + doubleToByteValue);

        scanner.close();
    }
}
