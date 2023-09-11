

import java.util.Scanner;

class Bito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Multiply the number by 2 using left shift (<<)
        int multiplied = number << 1;

        // Divide the number by 2 using right shift (>>)
        int divided = number >> 1;

        System.out.println("Original number: " + number);
        System.out.println("Multiplied by 2: " + multiplied);
        System.out.println("Divided by 2: " + divided);

        scanner.close();
    }
}

