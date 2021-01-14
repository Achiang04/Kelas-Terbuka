package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        try {
//            FileInputStream fileInput = new FileInputStream("input.txt");
//        } catch (Exception e){
//            System.out.println(e);
//        }

        /*
        cara membuat file :
        1. klik kanan nama project
        2. new
        3. file
        4. masukkan nama
        5. enter

        cara membuat jar file :
        1. file
        2. project structure
        3. artifacts
        4. (+)
        5. jar
        6. from modules ...
        7. pilih main class (projectnya)
        8. ok
        9. ok
        10. ok
        11. build
        12. build artifacts
        13. build

        tips :
        agar tidak error saat menjalankan program file input
        kita harus membuat file inputnya di package yang sama
        setiap kita ingin menjalankan program tersebut
         */

        FileInputStream fileInput = new FileInputStream("input.txt");

        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());

    }
}
