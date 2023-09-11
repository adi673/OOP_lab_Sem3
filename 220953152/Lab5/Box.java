import java.util.Scanner;

class Box {
     int length;
     int bredth;
     int height;


    Box(int length, int bredth,  int height)
    {
        this.length = length;
        this.bredth = bredth;
        this.height = height;
       
    }

    int getVolume()
    {
        return length*bredth*height;
    }
}

class Item
{
    public static void main(String[] args) {
        Box b1 = new Box(10,20,3);
        System.out.println("Volume of the box is: " + b1.getVolume());
    }
}
