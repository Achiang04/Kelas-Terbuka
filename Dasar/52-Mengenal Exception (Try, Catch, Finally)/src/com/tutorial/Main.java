package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = {0,1,2,3};

        Scanner inputUser = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("nilai array ke - ");
        int index = inputUser.nextInt();

        // exception handling (try,catch,finally)
        System.out.println("handling out of bound");
        try {
            System.out.printf("index ke- %d, adalah %d\n",index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        // runtime error jika file tidak ada
        System.out.println("Handling IO not found");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e){
            System.err.println(e);
        }

        // menggabungkan dua exception
        System.out.println("menggabungkan 2 buah exception");
        try {
            System.out.printf("index ke- %d, adalah %d\n",index, array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("index yang anda masukkan tidak sesuai dengan jumlah array");
        } catch (IOException e){
            System.err.println("file tidak ditemukan");
        }

        // finally
        System.out.println("menambahkan finally");
        try {
            System.out.printf("index ke- %d, adalah %d\n",index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("index yang anda masukkan tidak sesuai dengan jumlah array");
        } finally {
            System.out.println("finally");
        }

        System.out.println("akhir dari program");

    }
}
