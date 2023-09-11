    /*package whatever //do not write package name here */


import java.io.*;
import java.util.Scanner;


class Search{
	public static void main(String[] args){

        	Scanner scanner = new Scanner(System.in);
        	// int arr;
        	int size,key;
        	System.out.print("Enter the size of arrray ");
        	size = scanner.nextInt();

        	System.out.print("Enter the key to find ");
        	key = scanner.nextInt();
        	int arr[] = new int[size]; 
		// array declaration

		System.out.println("Enter the elements of the array: ");  
       		for(int i=0; i<size; i++)  {  
            		//reading array elements from the user   
           		arr[i]=scanner.nextInt();  
        	}  
        	int i=1;
		for ( int var : arr){   
            		if(var==key){
				System.out.print("key found at position "+ i );
            		}
            		i++;
        	}
	}
}
