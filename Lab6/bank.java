//run in replit

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
class Bank 
{
    public double getRateOfInterest() 
    {
        return 0.0;
    }
}

class SBI extends Bank 
{
    @Override
    public double getRateOfInterest() 
    {
        return 8.0;
    }
}

class ICICI extends Bank 
{
    @Override
    public double getRateOfInterest() 
    {
        return 7.0;
    }
}

class AXIS extends Bank 
{
    @Override
    public double getRateOfInterest() 
    {
        return 9.0;
    }
}

 class Main {
    public static void main(String[] args) 
    {
        Bank sbiBank = new SBI();
        Bank iciciBank = new ICICI();
        Bank axisBank = new AXIS();
        System.out.println("Interest rate for SBI bank: " + sbiBank.getRateOfInterest() + "%");
        System.out.println("Interest rate for ICICI bank: " + iciciBank.getRateOfInterest() + "%");
        System.out.println("Interest rate for AXIS bank: " + axisBank.getRateOfInterest() + "%");
    }
}
