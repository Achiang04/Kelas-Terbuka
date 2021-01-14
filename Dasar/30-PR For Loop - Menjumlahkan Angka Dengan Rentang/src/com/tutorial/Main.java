package com.tutorial;

import java.util.*;

public class Main {
    public static void main (String[] args){

        Scanner inputUser = new Scanner(System.in);
        int nilaiAwal, nilaiAkhir, total;

        System.out.println("ini adalah awal dari program");

        System.out.print("masukkan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        for (;nilaiAwal <= nilaiAkhir; nilaiAwal++){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);

            }
        System.out.println("ini adalah akhir dari program");
    }
}
