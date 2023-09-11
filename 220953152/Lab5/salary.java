



import java.util.Scanner;


class Employee{
    String name;
    String city;
    int salary;
    double da;
    double hra;
    double total;
    
    void getdata(){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee name:  ");
        name = scanner.nextLine();
        System.out.println("Enter Employee city name:  ");
        city = scanner.nextLine();
        System.out.println("Enter base Salary :  ");
        salary=scanner.nextInt();
        System.out.println("Enter dearness allowance in % :  ");
        da=scanner.nextDouble();
        System.out.println("Enter house rent in %:  ");
        hra=scanner.nextDouble();
    }
    
    void calculate(){
        total= salary+((salary*da)/100)+((salary*hra)/100);
        
    }
    
    void display(){
        System.out.println("Total salary is : "+total);
    }
    
    
};
class Main {
    public static void main(String[] args) {
        Employee Employee1=new Employee();
        Employee1.getdata();
        Employee1.calculate();
        Employee1.display();
    }
}
