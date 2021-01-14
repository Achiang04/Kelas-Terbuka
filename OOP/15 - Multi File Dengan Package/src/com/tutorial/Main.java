package com.tutorial;

// keyword import untuk package eksternal
import com.terminal.Console;

class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Asep");
        Player player2 = new Player("Ucup");
        Player player3 = new Player("Otong");
        player1.show();
        player2.show();
        player3.show();

        Console.log("Bambang");
        Console.log("Jancuk");
    }
}