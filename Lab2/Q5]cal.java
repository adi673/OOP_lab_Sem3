package Lab2;



import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch1;

        do{
          System.out.print("Enter a number: ");
          int num1 = scanner.nextInt();

          System.out.print("Enter a number: ");
          char ch = scanner.next().charAt(0);

          System.out.print("Enter a number: ");
          int num2 = scanner.nextInt();



          switch(ch){
            case '+':
                int sum=num1+num2;
                 System.out.println("Answer is : "+sum);
                break;
            case '-':
                int sub=num1-num2;
                System.out.println("Answer is : "+sub);
                break;

            case '*':
              int multi=num1*num2;
              System.out.println("Answer is : "+multi);
              break;

            case '/':
              int div=num1/num2;
              System.out.println("Answer is : "+div);
              break;
          }

          System.out.println("You want to perform further calculatons answer it in y/n: ");
          ch1 = scanner.next().charAt(0);
          
        
        }while(ch1=='y');

        

        scanner.close();
    }
}


