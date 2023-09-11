package Additional;

class MyInt {
    int value;

    MyInt(int value) 
    {
        this.value = value;
    }
}

public class swapbyval {
    public static void main(String[] args) {
        MyInt a = new MyInt(10);
        MyInt b = new MyInt(20);

        System.out.println("Before swap: a = " + a.value + ", b = " + b.value);
        swap(a, b);
        System.out.println("After swap: a = " + a.value + ", b = " + b.value);
    }

    public static void swap(MyInt x, MyInt y) 
    {
        int temp = x.value;
        x.value = y.value;
        y.value = temp;
    }
}
