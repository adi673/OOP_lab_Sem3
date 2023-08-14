package Lab3;

import java.util.Scanner;


class pattern1 {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        int n,r,sum=0,temp;
        System.out.print("Enter an integer number: ");
        n = scanner.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
