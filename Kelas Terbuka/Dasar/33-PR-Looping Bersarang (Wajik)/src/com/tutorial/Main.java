package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int i, j;
        int k = 9;

        for (i = 0; i < k; i++){
            for (j = 0; j < k; j++){
                if ((i + j) >= 9){
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        for (i = 0; i < k; i++){
            for (j = 0; j < k; j++){
                if ((j-i) >= 0){
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }
}