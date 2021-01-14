package com.tutorial;

public class Main{
    public static void main(String[] args) {
        // overloading pada constructor
        Player player1 = new Player("Bambang");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Asep");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // overloading pada methods

        int a = Matematika.tambah(5, 10);
        System.out.println(a);
        double b = Matematika.tambah(15, 5.85);
        System.out.println(b);
    }
}