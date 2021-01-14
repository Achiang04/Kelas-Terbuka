package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // menghitung deret fibonacci ke-n
        // menggunakan (While Loop)

        int fn1, fn2, fn, n;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukkan nilai fibonacci ke- ");
        n = inputUser.nextInt();

        fn2 = 0;
        fn1 = 1;
        fn = 1;

//        while (kondisi){
//            aksi
//        }

        int i = 1;

        while(i <= n){
            System.out.println("nilai ke- " + i + " adalah " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            i++;
        }
        System.out.println("selesai");
    }
}
