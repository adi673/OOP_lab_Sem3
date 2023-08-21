package Lab4;

import java.util.Scanner;

public class is_symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
         // Take the array size from the user
         System.out.println("Enter the Number of rows of the sqaure matrix ");
         int arr_row = 0;
         arr_row = sc.nextInt();
         

         int[][] arr = new int[arr_row][arr_row];
   
         // Take user elements for the array
         System.out.println(
             "Enter the elements of the array: ");
        
         for (int i = 0; i < arr_row; i++) {
             for (int j = 0; j < arr_row; j++) {
                 arr[i][j] = sc.nextInt();
            
             }
         }
         
         int flag=0;
         for (int i = 0; i < arr_row; i++) {
             for (int j = 0; j < arr_row; j++) {
                 if(i!=j){
                   if(arr[i][j]!=arr[j][i]){
                       flag=1;
                   }
                 }
                 
             }
         }
        if(flag==1){
             System.out.println("Matrix is not symmetric");
        }else if(flag==0){
            System.out.println("Matrix is symmetric");
        }    
         
         
         sc.close();
     }
}
