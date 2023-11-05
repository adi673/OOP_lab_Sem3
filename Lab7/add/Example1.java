/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
class Example1{
  //Static class
  static class X{
      static String str="Inside Class X";
  }
  public static void main(String args[])
  {
      X.str="Inside Class Example1";
      System.out.println("String stored in str is- "+ X.str);
  }
}
