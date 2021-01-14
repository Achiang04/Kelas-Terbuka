package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // cara membuat array 2 dimensi dengan assisgnment
        int[][] array_2D = {
                {1, 2},
                {3, 4}
        };
        printArray2d(array_2D);

        // cara membuat array 2 dimensi dengan deklarasi
        // int [baris] [kolom]
        int[][] arrayAngka = new int[5][4];
        printArray2d(arrayAngka);

        // looping lengkap secara manual
//        for (int i = 0; i < arrayAngka.length; i++){
//            System.out.print("[");
//            for (int j = 0; j < arrayAngka[i].length; j++){
//                System.out.print(arrayAngka[i][j] + ",");
//            }
//            System.out.print("]\n");
//        }

        // looping for each
//        for (int[] baris : arrayAngka){
//            System.out.print("[");
//            for (int angka : baris){
//                System.out.print(angka + ".");
//            }
//            System.out.print("]\n");
//        }

//    }
//    private static void printArray2d (int[][] dataArray){
//        for (int i = 0; i < dataArray.length; i++){
//            System.out.println(Arrays.toString(dataArray[i]));
//        }
//    }

        // -----------------------------------------------------------------------

        // array secara manual untuk pembuktian

        int[][] array_2D_2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
        };
        printArray2d(array_2D_2);

        int[][] array_regged = {
                {1,2,3},
                {4,5,6,7},
                {8},
        };
        printArray2d(array_regged);

    }
    private static void printArray2d (int[][] dataArray) {
        System.out.print("{\n");
        for (int[] baris : dataArray) {
            System.out.print("[");
            for (int angka : baris) {
                System.out.print(angka + ".");
            }
            System.out.print("]\n");
        }
        System.out.print("}\n");
    }
}
