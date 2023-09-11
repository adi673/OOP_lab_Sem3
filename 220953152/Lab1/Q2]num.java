package Lab1;

import java.util.Scanner;


class num {
  public static void main(String[] args) {
    
   int count=0; 
    int positive=0;
      int negative=0;
      int zero=0;
    while(count<=10){
      Scanner scanner = new Scanner(System.in);

      System.out.println("Put the length ");
      int num = scanner.nextInt();
      
      if(num>0){
        positive++;
      }else if(num<0){
        negative++;
      }else if(num==0){
        zero++;
      }
      count++;
    }
    

   
    System.out.println("Number of positive numbers: "+positive);
    System.out.println("Number of negative numbers: "+negative);
    System.out.println("Number of zzeros numbers: "+zero);
    

    
   
  }
}
