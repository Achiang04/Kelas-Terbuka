package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){

        /*
        menebak sebuah angka dengan input dari user dan memiliki sistem percabangan
        dengan menggunakan nested if
         */

        Scanner userIpnut = new Scanner(System.in);

        int a = 1;
        int b = 2;
        int c = 3;
        int nilaiTebakan1, nilaiTebakan2, nilaiTebakan3;
        boolean statusTebakan;

        System.out.println("masukkan 3 nilai tebakan anda");
        System.out.print("tebakan a = ");
        nilaiTebakan1 = userIpnut.nextInt();
        System.out.print("tebakan b = ");
        nilaiTebakan2 = userIpnut.nextInt();
        System.out.print("tebakan c = ");
        nilaiTebakan3 = userIpnut.nextInt();

        if (nilaiTebakan1 == a) {
            if (nilaiTebakan2 == b){
                if (nilaiTebakan3 == c){
                    System.out.println("semua benar"); // aksi 3
                } else {
                    System.out.println("a dan b benar, c salah"); // aksi 2
                }
            } else {
                System.out.println("a benar, b dan c salah"); //aksi 4
            }
        } else {
            System.out.println("semuanya salah"); // aksi 1
        }
    }
}