package Additional;
import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        int num,fact=1; 

        System.out.println("Enter a number\n");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        while(num>1)
        {
            fact = fact * num;
            num--;
        }

        System.out.println("Factorial = " + fact);
    }
}
