package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 5;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("masukkan nilai tebakan anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah : " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda = " + statusTebakan);

         // operasi aljabar boolean (and / or)

        System.out.print("masukkan nilai diantara 5 dan 10 : ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan >= 5) && (nilaiTebakan <= 10);

        System.out.println("tebakan anda = " + statusTebakan);



    }
}
