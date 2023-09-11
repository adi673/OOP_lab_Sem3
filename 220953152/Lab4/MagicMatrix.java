package Lab4;
import java.util.Scanner;
public class MagicMatrix {
    public static void main(String args[])
    {
        int r,c,sumd1=0,sumd2=0,rowSum=0,colSum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        r=in.nextInt();
        c=in.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter the matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                a[i][j]=in.nextInt();
        }
        if(r != c)
        {
            System.out.println("The given matrix is not a Square Matrix.");
        }
        else
        {
            for(int i=0;i<r;i++)
            {
                sumd1 += a[i][i];
                sumd2 += a[i][r-1-i];
            }
            if(sumd1!=sumd2)
            {
                System.out.println("The given matrix is not a Magic Matrix.");
                System.exit(0);
            }
            else
            {
                for (int i = 0; i < r; i++) 
                {
                    for (int j = 0; j < c; j++)
                    {
                        rowSum += a[i][j];
                        colSum += a[j][i];
                    }
                }
                if (rowSum != colSum || colSum != sumd1)
                {
                    System.out.println("The given matrix is not a Magic Matrix.");
                    System.exit(0);
                }
                else
                    System.out.println("The given matrix is a Magic Matrix.");
            }
        }           
    }
}  

