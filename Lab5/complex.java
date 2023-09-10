






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
        real=num.real+re;
        img=num.img;
    }

     void add(complex num1, complex num2){
        
         real=num1.real+num2.real;
         img=num1.img+num2.img;
        
     }

    void display(){
        System.out.println(real + "+" + img +"i");
    }
       
}
class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to add complex no. with integer and 2 for addition of two complex no.s");
        int n=sc.nextInt();
        
        
        switch(n)
        {
        case 1:
            System.out.println("Enter integer (real part) to add");
            int a=sc.nextInt();
            System.out.println("Enter real and immaginary part of complex numebr");
            int b=sc.nextInt();
            int c=sc.nextInt();
            complex ob1=new complex(b,c);
            complex num1=new complex();
            num1.add(a,ob1);
            num1.display();
            break;
        case 2:
            System.out.println("Enter real and immaginary part of complex numebr");
            int d=sc.nextInt();
            int e=sc.nextInt();
            complex ob2=new complex(d,e);
            System.out.println("Enter real and immaginary part of complex numebr");
            int f=sc.nextInt();
            int g=sc.nextInt();
            complex ob3=new complex(f,g);

            complex num2=new complex();
            num2.add(ob2,ob3);
            num2.display();
        
       
             break;
        default:
            System.out.println("Incorrect input");
            break;
        }
    }
}
