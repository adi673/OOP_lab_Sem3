package Additional;


class Game
{
    void type()
    {
        System.out.println("Indoor and outdoor games");
    }
}

class Cricket extends Game
{
    void type()
    {
        System.out.println("Cricket is an outdoor game");
    }
}

class Chess extends Game
{
    void type()
    {
        System.out.println("Chess is an indoor game");
    }
}

class GameDemo
{
    public static void main(String[] args) {
        Game g = new Game();
        Cricket c = new Cricket();
        Chess ch = new Chess();

        System.out.println("Printing type method of Game");
        g.type();

        System.out.println("");

        System.out.println("Printing type method of Cricket");
        c.type();

        System.out.println("");

        System.out.println("Printing type method of Chess");
        ch.type();
    }
}