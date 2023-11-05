/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.*;

class Account1 
{
    String name;
    int accno;
    String typeofacc;
    float balance;
    
}

public class Account {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        Account1 a = new Account1();
        System.out.println("Enter Name of Person: ");
        a.name=sc.next();
        System.out.println("Enter Acc.No.: ");
        a.accno=sc.nextInt();
        System.out.println("Enter Type of Account: ");
        a.typeofacc = sc.next();
        System.out.println("Enter Account Balance: ");
        a.balance = sc.nextFloat();
        while (1 < 100) {
            System.out.println("Enter 1-Deposit, 2-Display, 3-Compute Interest, 4-Widthdraw, 5-Check for Penalty, 6-Exit");
            int op = sc.nextInt();
            if (op == 6) 
            {
                break;
            }
            switch (op) 
            {
                case 1:
                    System.out.println("Enter Amount: ");
                    float amt = sc.nextFloat();
                    a.balance += amt;
                    System.out.println(a.balance);
                    break;
                case 2:
                    System.out.println(a.balance);
                    break;
                case 3:
                    if("Current".equals(a.typeofacc)){
                        System.out.println("interest is 0");
                    }
                    else{
                    float interest = (float) (a.balance * .12);
                    System.out.println("Interest is " + interest);
                    }
                    break;
                case 4:
                    System.out.println("Enter Amount to Withdraw: ");
                    float gone = sc.nextFloat();
                    a.balance -= gone;
                    System.out.println(a.balance);
                    break;
                case 5:
                    if ("Savings".equals(a.typeofacc) && a.balance < 5000) 
                    {
                        System.out.println("Service Charge is " + 500);
                        a.balance -= 500;
                    } 
                    else 
                    {
                        System.out.println("No Service Charge.");
                    }
                break;
            }
        }
    }
}