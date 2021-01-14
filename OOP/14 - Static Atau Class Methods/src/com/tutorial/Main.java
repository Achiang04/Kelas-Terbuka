package com.tutorial;

import java.util.ArrayList;

class Player{
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player(String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("PLayer Name = " + this.name);
    }

    // static method
    static void showNumberOfPlayer(){
        System.out.println("Number of Player = " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }
}

class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Bambang");
        Player player2 = new Player("Asep");
        Player player3 = new Player("Jancuk");
        Player player4 = new Player("Joseph");

        Player.showNumberOfPlayer();
        
        
        System.out.println("Names = " + Player.getNames());
        // System.out.println("Names = " + player1.getNames()); // ini bisa dilakukan
    }
}