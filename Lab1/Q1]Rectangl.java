package Lab1;
import java.util.Scanner;


class Rectangle {
  public static void main(String[] args) {
    
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Put the length ");
    int len = scanner.nextInt();

    System.out.println("Put the breadth ");
    int breadth = scanner.nextInt();

    int area=len*breadth;
    int circum=2*(len+breadth);

    System.out.println("Area of rectanglr is: "+area);
    System.out.println("Area of rectanglr is: "+circum);
    

    
   
  }
}