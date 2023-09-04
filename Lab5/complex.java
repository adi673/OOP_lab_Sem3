package Lab5;

import java.util.*;
class complex
{
    int real;
    int img;

    complex(){
        this.real=0;
        this.img=0;
    }

    complex(int real, int img){
        this.real=real;
        this.img=img;
    }
    
    void add(int re, complex num){
        num.real=num.real+re;
        num.img=num.img;
    }

    void add(complex num1, complex num2){
       
        num3.real=num1.real+num2.real;
        num3.img=num1.img+num2.img;
    }

    void display(complex num){
        System.out.println(num.real +"+"+num.img+"i");
    }
       
}
class woah
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to add complex no. with integer and 2 for addition of two complex no.s");
        int n=sc.nextInt();
        
        
        switch(n)
        {
        case 1:
        System.out.println("give an integer, the real part and imaginary part of a complex number respectively");
        int a=sc.nextInt();
        int b=sc.nextInt();
        complex ob1=new complex(a,b);

        int c=sc.nextInt();
        int d=sc.nextInt();
        complex ob2=new complex(c,d);
        complex num3=new complex();
        // num3.add()
        display(num3);
        break;
        case 2:
        System.out.println("give the real part and imaginary part of complex number 1 respectively");
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        System.out.println("give the real part and imaginary part of complex number 2 respectively");
        int a2=sc.nextInt();
        int b2=sc.nextInt();
        ob.add(a1,a2,b1,b2);
        break;
        default:
        System.out.println("Incorrect input");
        break;
        }
    }
}
