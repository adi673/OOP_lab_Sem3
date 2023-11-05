/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Game 
{
    public void type() 
    {
        System.out.println("Indoor & outdoor games");
    }
}

class Cricket extends Game 
{
    @Override
    public void type() 
    {
        System.out.println("Cricket is an outdoor game");
    }
}

class Chess extends Game 
{
    @Override
    public void type() 
    {
        System.out.println("Chess is an indoor game");
    }
}

public class CricketAndChess {
    public static void main(String[] args) 
    {
        Game cricketGame = new Cricket();
        Game chessGame = new Chess();
        cricketGame.type(); 
        chessGame.type();   
    }
}
