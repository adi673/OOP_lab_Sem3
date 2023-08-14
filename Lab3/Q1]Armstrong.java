package Lab1.Lab3;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;


class armstrong {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        int n,r,sum=0,temp;
        System.out.print("Enter an integer number: ");
        n = scanner.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        
        if(temp==sum){
            System.out.println("Given number is armstrong number");
        }else{
            System.out.println("Given number is not an  armstrong number");
        }
        
        scanner.close();
    }
}
