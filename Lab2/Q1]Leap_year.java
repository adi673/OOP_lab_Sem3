package Lab2;



import java.util.Scanner;


class num {
  public static void main(String[] args) {
    
   
        int year = 2024; // Change this value to check different years

        boolean isLeapYear = false;

        if (year % 4 != 0) {
            // Not divisible by 4, common year
            isLeapYear = false;
        } else if (year % 100 != 0) {
            // Divisible by 4 but not by 100, leap year
            isLeapYear = true;
        } else if (year % 400 != 0) {
            // Divisible by 100 but not by 400, common year
            isLeapYear = false;
        } else {
            // Divisible by 400, leap year
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }  

  

    
   
  }


