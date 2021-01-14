package com.tutorial;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // byte stream -> FileInputStream & FileOutputStream
        // character stream -> FileReader & FileWriter

        // membuka file
        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader      charFileInput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter       charFileOutput = new FileWriter("OutputChar.txt");

        // membaca file

//        System.out.println((char)byteFile.read());
//        System.out.println((char)charFile.read());
//        System.out.println((char)byteFile.read());
//        System.out.println((char)charFile.read());

        // 1. byteFile
        int buffer = byteFileInput.read();
        while (buffer != -1){
            System.out.print((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }
        System.out.println("\n");

        // 2. charFile
        buffer = charFileInput.read();
        while (buffer != -1){
            System.out.print((char)buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        // menutup file
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();

    }
}
