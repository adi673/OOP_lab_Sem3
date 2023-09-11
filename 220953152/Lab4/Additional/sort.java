package Lab4.Additional;

import java.util.Scanner;

class sort {
    
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
      
            // Take the array size from the user
            System.out.println("Enter the Number of elements of the array 1: ");
            int arr_size1 = 0;
            arr_size1 = sc.nextInt();
            System.out.println("Enter the Number of elements of the array 2: ");
            int arr_size2 = 0;
            arr_size2 = sc.nextInt();

            int[]arr1 = new int[arr_size1];
            int[]arr2 = new int[arr_size2];
      
            // Take user elements for the array
            System.out.println(
                "Enter the elements of the array1: ");
           
            for (int i = 0; i < arr_size1; i++) {
                    arr1[i] = sc.nextInt();
            }
            
            System.out.println(
                "Enter the elements of the array2: ");
            for (int i = 0; i < arr_size2; i++) {
                    arr2[i] = sc.nextInt();
            }
            
            
            int arr_size3 = 0;
            arr_size3=arr_size1+ arr_size2;
            int[]arr3 = new int[arr_size3];
            
            int j=0;
            for (j = 0; j < arr_size1; j++) {
                    arr3[j] = arr1[j];
            }
            int i=0;
            for (j = arr_size1; j < arr_size3; j++){
                    arr3[j] = arr2[i];
                    i++;
            }

            for (int q = 0; q < arr_size3-1; q++){
            // Find the minimum element in unsorted array
                int min_idx = q;
                for (int p = q+1; p < arr_size3; p++){
                    if (arr3[p] < arr3[min_idx]){
                        min_idx = p;
                    }
                }                   
                // Swap the found minimum element with the first element
                
                int temp = arr3[min_idx];
                arr3[min_idx] = arr3[q];
                arr3[q] = temp;
                
            }
            
            System.out.println("The elements of the array are: ");
          
            
           for (int k = 0; k < arr_size3; k++) {
                System.out.print(arr3[k]+ " ");
            }
 
            
            sc.close();
        }
    
}
