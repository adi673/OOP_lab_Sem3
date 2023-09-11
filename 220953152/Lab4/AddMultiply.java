package Lab4;
import java.util.Scanner;
public class AddMultiply {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for Matrix 1: ");
        int r1=in.nextInt();
        int c1=in.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("Enter the matrix");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns for Matrix 2: ");
        int r2=in.nextInt();
        int c2=in.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("Enter the Matrix: ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        if(c1!=r2)
        {
            System.out.println("Matrix cannot be added or multiplied");
            System.exit(0);
        }
        System.out.println("Sum of the Two Matrix is:  ");
        int c[][]=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                    c[i][j]+=a[i][j]+b[i][j];
                    System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        int d[][]=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                    d[i][j]+=a[i][k]*b[k][j];
            }
        }
        System.out.println("\nThe Multiplied Matrix is: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                     System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
