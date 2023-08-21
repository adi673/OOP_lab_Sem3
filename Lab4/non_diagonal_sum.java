package Lab4;

import java.util.Scanner;

public class non_diagonal_sum {
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
         
         int sum=0;
         
         // for (int i = 0; i < arr_row; i++) {
         //     for (int j = 0; j < arr_row; j++) {
         //         if(i+j==(arr_row-1)){
         //           sum=sum+arr[i][j];
         //           System.out.println(arr[i][j]+" ");
         //         }
                 
         //     }
         // }
         
         for (int i = 0; i < arr_row; i++) {
             for (int j = 0; j < arr_row; j++) {
                 if(i+j!=(arr_row-1) && i!=j){
                   sum=sum+arr[i][j];
                   System.out.println(arr[i][j]+" ");
                 }
                 
             }
         }
        
         System.out.println("The sum of non  diagonal elements of Matrix is : "+sum);
         
         
         sc.close();
     }
}
