

import java.util.*;
class time
{
    int h,m,s;
    time()
    {
        h=0;
        m=0;
        s=0;
    }
    time(int hr,int min,int sec)
    {
        h=hr;
        m=min;
        s=sec;
        
    }
    void display()
    {
        System.out.println(h+"hr"+":"+m+"min"+":"+s+"sec");
    }
    void add(time ob1, time ob2)
    {
        int totalTime1=(ob1.h)*3600+(ob1.m)*60+(ob1.s);
        int totalTime2=(ob2.h)*3600+(ob2.m)*60+(ob2.s);
        int totalTime3=totalTime1+totalTime2;
        h=totalTime3/3600;
        totalTime3=totalTime3%3600;
        m=totalTime3/60;
        totalTime3=totalTime3%60;
        s= totalTime3;
        
    }
}
class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hours minutes and seconds of time 1");
        int H1=sc.nextInt();
        int M1=sc.nextInt();
        int S1=sc.nextInt();
        time ob1=new time(H1,M1,S1);
        System.out.println("Enter hours minutes and seconds of time 2");
        int H2=sc.nextInt();
        int M2=sc.nextInt();
        int S2=sc.nextInt();
        time ob2=new time(H2,M2,S2);
        time ob3=new time();
        // ob1.display();
        // ob2.display();
        ob3.add(ob1, ob2);
        ob3.display();
    }
}
