package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // switch case
        // ekspresinya dapat berupa (int, byte, long, short), string, atau enum

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("absen = ");
        input = inputUser.next();

        switch (input){
            case "otong":
                System.out.println("hadir pak saya otong");
                break;
            case "ucup":
                System.out.println("hadir pak saya ucup");
                break;
            case "mario":
                System.out.println("hadir pak saya mario");
                break;
            default:
                System.out.println(input + " tidak hadir pak");
        }

        System.out.println("program  selesai");

    }
}
