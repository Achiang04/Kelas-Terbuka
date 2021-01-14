package com.tutorial;

import bambang.util.jancuk;

public class Main {
    public static void main(String[] args) {
        // public, private, default, dan protected

        // dengan acces modifier public, dapat diakses
        Lain.methodePublic();

        // dengan acces modifier private, tidak dapat diakses
        // Lain.methodPrivate();

        // karena ada dalam package yang sama, maka dapat diakses
        Lain.methodeDefault();

        // karena ada dalam package yang sama, maka dapat diakses
        Lain.methodeProtected();

        jancuk.bangcatPublic();
//        jancuk.bangcatPrivate(); // tidak bisa
//        jancuk.bangcatDefault(); // tidak bisa
//        jancuk.bangcatProtected(); // tidak bisa
    }
}
