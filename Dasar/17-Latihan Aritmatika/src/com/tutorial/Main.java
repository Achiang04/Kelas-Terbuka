package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Latihan 1");

        Scanner userInput = new Scanner(System.in);

        int input1 = userInput.nextInt();
        System.out.println("input1 = " + input1);

        int input2 = userInput.nextInt();
        System.out.println("input2 = " + input2);

        System.out.println("Latihan 2");

        Scanner userInput1 = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

        System.out.println("MENGHITUNG LUAS & VOLUME");
        System.out.print("panjang = ");
        panjang = userInput1.nextInt();
        System.out.print("lebar = ");
        lebar = userInput1.nextInt();
        System.out.print("tinggi = ");
        tinggi = userInput1.nextInt();

        luas = panjang * lebar;
        System.out.println("luas = " + luas);
        volume = panjang * lebar * tinggi;
        System.out.println("volume = " + volume);

    }
}
