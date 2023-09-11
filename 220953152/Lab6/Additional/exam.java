package Additional;

import java.util.Scanner;

class Result
{
    Scanner s = new Scanner(System.in);
    int total[] = new int[3];
    int marks[][] = new int[3][4];

    void read()
    {
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Enter roll no : ");
            marks[i][0] = s.nextInt();
            System.out.print("Enter marks of subject 1: ");
            marks[i][1] = s.nextInt();
            System.out.print("Enter marks of subject 2: ");
            marks[i][2] = s.nextInt();
            System.out.print("Enter marks of subject 3: ");
            marks[i][3] = s.nextInt();
        }
        
    }

    void total()
    {
        for(int i = 0; i < 3; i++)
        {
            total[i] = 0;
            for(int j = 1; j < 4; j++)
            {
                total[i] += marks[i][j];
            }

        }
    }

    void highest(int sub)
    {
        int max = marks[0][sub];
        int n = marks[0][0];
        for(int i = 0; i < 3; i++)
        {
            if(max < marks[i][sub])
            {
                n = marks[i][0];
                max = marks[i][sub];
            }
        }
        System.out.println("Highest marks in subject" + sub + " is " + max + " by roll no " + n + "");
    }

    int htotal()
    {
        int max = total[0];
        int n = marks[0][0];
        for(int i = 1; i < 3; i++)
        {
            if(total[i] > max)
            {
                max = total[i];
                n = marks[i][0];
            }
        }

        return n;
    } 
}
public class exam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Result r = new Result();
        System.out.println("Enter details of 3 students : ");
        r.read();

        r.total();
        
        System.out.print("Enter subject for which highest marks is to be found: ");
        int a = s.nextInt();
        r.highest(a);

        System.out.println("Roll No " + r.htotal() + " Got the highest total marks");
        s.close();
    }
}