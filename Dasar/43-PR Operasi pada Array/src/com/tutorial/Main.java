package com.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        /*
        Tugas
        1. cara searching dengan data sembarang pake loopoiing
        2. sorting secara descending pake looping
        3. melakukan operasi tambah dua buah array bikin fungsi pake copy of
        4. menggabungkan 2 buah array
         */

        // 1. searching dengan data sembarang
        System.out.println("\nMencari index dengan data sembarang");
        int[] arrayAngka1 = {8,3,4,2,5,1,6,7,9};
        int cari;

        System.out.print("masukkan angka yang dicari (1-9) = ");
        cari = inputUser.nextInt();
        System.out.println(Arrays.toString(arrayAngka1));
        fungsiCari(arrayAngka1,cari);

        // 2. sortingg secara descending
        System.out.println("\nmensorting secara descending");
        int[] arrayAngka2 = {6,3,2,1,7,1,8,3,4,2,3,2};
        urutkan(arrayAngka2);

        int[] arrayAngka3 = {1,2,3,4,5};
        int[] arrayAngka4 = {1,2,3,4,5};

        // 3. operasi penambahan dua buah array
        System.out.println("\npenambahan 2 buah array");
        tambah(arrayAngka3,arrayAngka4);

        // 4. menggabungkan 2 buah array
        System.out.println("\nmenggabungkan 2 buah array");
        gabung(arrayAngka3,arrayAngka4);

    }
    //fungsi untuk mencari array
    private static void fungsiCari (int[] dataArray, int dicari){
        for (int i = 0; i < dataArray.length; i++){
            if (dataArray[i] == dicari){
                System.out.println(dataArray[i] + " berada di index ke - " + i);
            }
        }
    }
    //fungsi sorting
    private static void urutkan (int[] dataArray){
        int tukar;
        System.out.println(Arrays.toString(dataArray));

        for (int i = 0; i < dataArray.length; i++){
            for (int j = i + 1; j < dataArray.length; j++){
                if (dataArray[i] < dataArray[j]){
                    tukar = dataArray[i];
                    dataArray[i] = dataArray[j];
                    dataArray[j] = tukar;
                }
            }
        }
        System.out.println(Arrays.toString(dataArray));
    }
    //penambahan 2 buah array
    private static void tambah (int[] dataArray1, int[] dataArray2){
        int hasil[] = new int[5];
        System.out.println(Arrays.toString(dataArray1));
        System.out.println(Arrays.toString(dataArray2));
        System.out.println("----------------- (+)");
        for (int i = 0; i < dataArray1.length; i++){
            hasil[i] = dataArray1[i] + dataArray2[i];
        }
        System.out.println(Arrays.toString(hasil));
    }
    //penggabungan
    private static void gabung (int[] dataArray1, int[] dataArray2){
        int[] hasil = new int[10];
        for (int i = 0; i < (dataArray1.length + dataArray2.length); i++){
            if (i < 5){
                hasil[i] = dataArray1[i];
            } else {
                hasil[i] = dataArray2[i-dataArray1.length];
            }
        }
        System.out.println(Arrays.toString(hasil));
    }
}

