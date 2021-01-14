package com.tutorial;

public class Lain {

    // bagian ini dapat diakses oleh siapa pun
    public static void methodePublic(){
        System.out.println("Lain: public");
//        methodePrivate();

    }
    // bagian ini hanya dapat diakses oleh class yang bersangkutan
    private static void methodePrivate() {
        System.out.println("Lain: private");

    }
    // bagian ini hanya dapat diakses oleh class dalam package yang sama
    static void methodeDefault() {
        System.out.println("Lain: default");

    }
    // bagian ini hanya dapat diakses oleh class dalam package yang sama
    // dan subclassnya.
    protected static void methodeProtected() {
        System.out.println("Lain: protected");
    }
}
