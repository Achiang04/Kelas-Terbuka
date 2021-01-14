package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // menghitung deret fibonacci ke-n menggunakan Do While Loop

        int fn1, fn2, fn, n;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukkan nilai fibonnaci ke- ");
        n = inputUser.nextInt();

        fn2 = 0;
        fn1= 1;
        fn = 1;

//        do{
//            aksi;
//        } while (kondisi);

        int i = 1;
        boolean kondisi = true;

        do{
            System.out.println("nilai ke- " + i + " adalah " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            i++;

            if (i >= n + 1){
                kondisi = false;
            }
        } while (kondisi);


    }
}
