package com.tutorial;

public class Main {
    public static void main(String[] args){

        // control flow (break, continue, dan return

        int a = 0;

        while (true){
            a++;

            if (a == 10){
                break;
                // ini adalah keyword untuk memaksa keluar dari loop
            } else if (a == 5){
                continue;
                // ini adalah keyword untuk memaksa memulai dari awaal
            } else if (a == 7){
                return;
            }
            System.out.println("looping ke - " + a);
        }
        System.out.println("ini adalah akhir dari program");
    }
}
