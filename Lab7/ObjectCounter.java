/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
class Counter {
    private static int objectCount = 0;
    public Counter() 
    {
        objectCount++;
    }

    public static int getObjectCount() 
    {
        return objectCount;
    }
}
public class ObjectCounter {
    public static void main(String[] args) 
    {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        int count = Counter.getObjectCount();
        System.out.println("Number of objects created: " + count);
    }
}