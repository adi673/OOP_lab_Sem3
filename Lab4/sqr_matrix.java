package Lab4;





import java.util.Scanner;

class oper{
    
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
            
            int trace=0;
            double norm=0;
            for (int i = 0; i < arr_row; i++) {
                for (int j = 0; j < arr_row; j++) {
                    if(i==j){
                      trace=trace+arr[i][j];
                    }
                    norm=norm+((arr[i][j])*(arr[i][j]));
                }
            }
            double  sqrtnorm=(Math.pow(norm,0.5));
            System.out.println("The Trace of the given Matrix is : "+trace);
            System.out.println("The norm of the given Matrix is : "+sqrtnorm);
            
            sc.close();
        }
    
}

