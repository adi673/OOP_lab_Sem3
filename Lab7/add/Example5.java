/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
class Example5{
   static int i;
   static String s;
   public static void main(String args[]) //Its a Static Method
   {
       Example5 obj=new Example5();
       //Non Static variables accessed using object obj
       System.out.println("i:"+obj.i);
       System.out.println("s:"+obj.s);
   }
}
