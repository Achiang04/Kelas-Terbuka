package com.tutorial;

import java.util.*;
import java.lang.String;

public class Main {
    public static void main(String[] args){

        Scanner inputUser = new Scanner (System.in);
        System.out.print("masukkan nilai n = ");
        int nilai = inputUser.nextInt();
        int nilaiFibonacci = fibonacci(nilai,"atas");
        System.out.println("nilai fibonacci ke- " + nilai + " adalah " + nilaiFibonacci);
    }
    private static int fibonacci(int n, String daun){
        System.out.println("daun " + daun);
        System.out.println("fibonacci ke - " + n);
        if (n == 1 || n == 0){
            return n;
        } else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }
}
