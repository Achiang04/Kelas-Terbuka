package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner inputUSer = new Scanner(System.in);
        System.out.print("panjang = ");
        int inputPanjang = inputUSer.nextInt();
        System.out.print("lebar = ");
        int inputLebar = inputUSer.nextInt();

        gambar(inputPanjang, inputLebar);

//        System.out.println("luas = " + luas(inputPanjang,inputLebar));
//        System.out.println("keliling = " + keliling(inputPanjang,inputLebar));

        tampilanKelilingDanLuas(inputPanjang,inputLebar);

    }
    private static void tampilanKelilingDanLuas(int panjang, int lebar){
        System.out.println("luas = " + luas(panjang,lebar));
        System.out.println("keliling = " + keliling(panjang, lebar));
    }
    private static int keliling(int panjang, int lebar){
        int keliling = (panjang + lebar)*2;
        return keliling;
    }
    private static int luas(int panjang, int lebar){
        int hasil = panjang*lebar;
        return hasil;
    }
    private static void gambar(int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}
