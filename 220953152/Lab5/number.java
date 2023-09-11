/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

class Number {
      double num;

    public Number(double num) {
        this.num = num;
    }

    public boolean isZero() {
        return num == 0;
    }

    public boolean isPositive() {
        return num > 0;
    }

    public boolean isNegative() {
        return num < 0;
    }

    public boolean isOdd() {
        return num % 2 != 0;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }

    public boolean isPrime() {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isArmstrong() {
        int temp = (int) num;
        int digits = String.valueOf(temp).length();
        int sum = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        return (int) num == sum;
    }

    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            Number myNumber = new Number(number);
            System.out.println("Is zero? " + myNumber.isZero());
            System.out.println("Is positive? " + myNumber.isPositive());
            System.out.println("Is negative? " + myNumber.isNegative());
            System.out.println("Is odd? " + myNumber.isOdd());
            System.out.println("Is even? " + myNumber.isEven());
            System.out.println("Is prime? " + myNumber.isPrime());
            System.out.println("Is Armstrong? " + myNumber.isArmstrong());
            scanner.close();
        }
    }
}
