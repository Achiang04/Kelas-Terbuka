package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayAngka1 = {2,4,6,8,12,8,0,6,8,54};
        int[] arrayAngka2 = {1,5,7,2,3,6,8,0,64,7};

        // penjumlahan antara 2 buah array
        System.out.println("----------penjumlahan---------");
        int[] arrayHasil1 = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil1, "hasil 1");

        // menggabungkan 2 buah array
        System.out.println("----------penggabungan---------");
        int[] arrayHasil2 = new int [arrayAngka1.length + arrayAngka2.length];

        for (int i = 0; i < arrayAngka1.length; i++){
            arrayHasil2[i] = arrayAngka1[i];
        }
        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }

        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil2, "hasil 1");

        // sorting reverse, mengurutkan tapi kebalik
        System.out.println("-----------sorting reverse 1--------");
        printArray(arrayAngka1, "array 1");
        reverse1(arrayAngka1);
        printArray(arrayAngka1, " reverse 1");

        System.out.println("-----------sorting reverse 2--------");
        printArray(arrayAngka2, "array 2");
        reverse2(arrayAngka2);
        printArray(arrayAngka2, " reverse 2");

    }
    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;

        for (int i = 0; i < dataArray.length/2; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }

    private static void reverse1(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);

        for (int i = 0; i < dataArray.length; i++){
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }

    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++){
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }

    private static void printArray (int[] dataArray, String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
}
