package com.tutorial;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        long waktuStart, waktuFinish;

        // membaca dari file
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());

        // menghitung wakatu pembacaan dari file
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));
        byteInput.close();

        // membaca dari memory
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);

        bufferedInput.mark(200);
        // menghitung waktu dari memory
        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));

        // baca ulang
        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);
        bufferedInput.close();
        byteInput2.close();

        // menulis dengan buffered output
        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        // write berupa byte
        bufferedOutput.write(data,0,data.length);
        bufferedOutput.flush();

        bufferedOutput.close();
        byteOutput.close();

    }
}
