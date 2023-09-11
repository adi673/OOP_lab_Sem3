package Lab4;

import java.util.Scanner;

public class mat_mult_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
         // Take the array size from the user
         System.out.println("Enter the Number of rows of the sqaure matrix ");
         int arr_row = 0;
         arr_row = sc.nextInt();
         

         int[][] a = new int[arr_row][arr_row];
   
         // Take user elements for the array
         System.out.println(
             "Enter the elements of the array a: ");
        
         for (int i = 0; i < arr_row; i++) {
             for (int j = 0; j < arr_row; j++) {
                 a[i][j] = sc.nextInt();
            
             }
         }
         
         
         
         
         

         int[][] b = new int[arr_row][arr_row];
         int[][] c = new int[arr_row][arr_row];
         int[][] d = new int[arr_row][arr_row];
         // Take user elements for the array
         System.out.println(
             "Enter the elements of the array b: ");
        
         for (int i = 0; i < arr_row; i++) {
             for (int j = 0; j < arr_row; j++) {
                 b[i][j] = sc.nextInt();
            
             }
         }

         for(int i=0;i<arr_row;i++){    
             for(int j=0;j<arr_row;j++){    
                 c[i][j]=0;      
                 for(int k=0;k<arr_row;k++){      
                     c[i][j]+=a[i][k]*b[k][j];      
                 }
             } 
         }
         
         for(int i=0;i<arr_row;i++){    
             for(int j=0;j<arr_row;j++){    
                 d[i][j]=a[i][j]+b[i][j];
             }
         }    
         
         System.out.println("Mutiplication Matrix is: ");
         for(int i=0;i<arr_row;i++){    
             for(int j=0;j<arr_row;j++){    
                 System.out.print( c[i][j] + " ");
             }
              System.out.println();
         }   
         
         System.out.println("Addition Matrix is: ");
         for(int i=0;i<arr_row;i++){    
             for(int j=0;j<arr_row;j++){    
                 System.out.print( d[i][j] + " ");
             }
              System.out.println();
         }  
         sc.close();
     }
}
