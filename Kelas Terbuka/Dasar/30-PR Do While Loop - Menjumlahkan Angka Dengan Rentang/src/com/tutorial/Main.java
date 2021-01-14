package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // membuat program untuk menjumlahkan angka dengan rentang
        // menggunakan do while loop

        Scanner inputUSer = new Scanner(System.in);
        int nilaiAwal, nilaiAkhir, total;
        boolean kondisi = true;

        System.out.print("masukkan nilai awal = ");
        nilaiAwal = inputUSer.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir = inputUSer.nextInt();

        total = 0;

        do{
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;

            if (nilaiAwal >= nilaiAkhir + 1) {
                kondisi = false;
            }
        } while (kondisi);
        System.out.println("ini adalah akhir dari program");
    }
}
