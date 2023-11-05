/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
class Example2{
   int num;
   //Static class
   static class X{
      static String str="Inside Class X";
      //num=99;
   }
   public static void main(String args[])
   {
      Example2.X obj = new Example2.X();
      System.out.println("Value of num="+obj.str);
   }
}

