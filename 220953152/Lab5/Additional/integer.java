package Additional;

import java.util.Scanner;

class Integer
{
    Scanner s = new Scanner(System.in);
    int arr[] = new int[10];

    void input()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter element to be inserted: ");
            arr[i] = s.nextInt();
        }
    }

    void disp()
    {
        System.out.println("Array elements are : ");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }

    void largest()
    {
        int max = arr[0];

        for(int i = 0; i < 10; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        System.out.println("Max value in array is " + max);
    }

    void avg()
    {
        double sum = 0;

        for(int i = 0; i < 10; i++)
        {
            sum += arr[i];
        }

        sum = sum / 10;

        System.out.println("Average of the integer array is : " + sum);
    }

    void sort()
    {
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9 - i ; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        disp();
    }
}

public class integer {
    public static void main(String[] args) {
        Integer i = new Integer();
        
        i.input();

        i.disp();

        i.largest();

        i.avg();

        i.sort();
    }
}

