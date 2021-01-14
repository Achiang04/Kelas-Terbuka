package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

//        Scanner inputUser = new Scanner(System.in);
//        String input = inputUser.next();
//        System.out.println(input);
//        input = inputUser.next();
//        System.out.println(input);

        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

//        System.out.println((char)bufferedReader.read());

        Scanner scanner = new Scanner(bufferedReader);

        System.out.println("input.txt");

        // ini untuk cek ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext()); // true

        // untuk membaca kata, dengan pemisah atau delimiter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext()); // false

        System.out.print("\n");
        System.out.println("input2.txt");

        // menggunakan delimiter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");
//        System.out.println(scanner.hasNext());

        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

        System.out.print("\n");
        System.out.println("input2.txt (String Tokenizer)");

        // menggunakan string tokenizer
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(data,",");
        while (stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }

        // baris kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        stringToken = new StringTokenizer(data,",");
        while (stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }
    }
}
