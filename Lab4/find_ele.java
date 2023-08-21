package Lab4;



import java.util.Scanner;

class find_ele {
    
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
      
            // Take the array size from the user
            System.out.println("Enter the Number of rows of the array: ");
            int arr_row = 0;
            arr_row = sc.nextInt();
            System.out.println("Enter the Number of columns of the array: ");
            int arr_columns = 0;
            arr_columns = sc.nextInt();

            int[][] arr = new int[arr_row][arr_columns];
      
            // Take user elements for the array
            System.out.println(
                "Enter the elements of the array: ");
           
            for (int i = 0; i < arr_row; i++) {
                for (int j = 0; j < arr_columns; j++) {
                    arr[i][j] = sc.nextInt();
               
                }
            }
            
            System.out.println("The elements of the array are: ");
        //   for (int i = 0; i < arr_row; i++) {
        //         for (int j = 0; j < arr_columns; j++) {
        //             System.out.print(arr[i][j] + " ");
               
        //         }
        //         System.out.println();
        //     }
            
            int key;
            System.out.println("Element to find is:  ");
            key= sc.nextInt();
            
            int count=0;
            for (int i = 0; i < arr_row; i++) {
                for (int j = 0; j < arr_columns; j++) {
                    if(key==arr[i][j]){
                      count++;
                    }
                }
            }
            
            System.out.println("The key occured: "+count+" times.");
            
            sc.close();
        }
    
}
