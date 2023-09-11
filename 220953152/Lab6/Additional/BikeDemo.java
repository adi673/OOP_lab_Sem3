package Additional;

class Bike
{
    int speedlimit = 60;

    void run()
    {
        System.out.println("Bike is running with speed limit " + speedlimit);
    }
}

class Splendor extends Bike
{
    int speedlimit = 80;
    void run()
    {
        System.out.println("Splendor is running with speed limit " + speedlimit);
    }

}

public class BikeDemo {
    public static void main(String[] args) {
        Bike b = new Bike();
        Splendor s = new Splendor();

        System.out.println("For Bike:- ");
        b.run();

        System.out.println("");

        System.out.println("For Splendor:- ");
        s.run();

    }
}