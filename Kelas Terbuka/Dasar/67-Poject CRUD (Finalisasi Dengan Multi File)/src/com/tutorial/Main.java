package com.tutorial;

// import java library
import java.io.IOException;
import java.util.Scanner;
import java.lang.String;

// import CRUD library
import CRUD.Operasi;
import CRUD.Utility;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            Utility.clearScreen();
            System.out.println("\nDatabase Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\nMasukkan pilihan anda = ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n===============");
                    System.out.println("LIST SEMUA BUKU");
                    System.out.println("===============");
                    Operasi.tampilkanData();
                    break;
                case "2":
                    System.out.println("\n==============");
                    System.out.println("CARI DATA BUKU");
                    System.out.println("==============");
                    Operasi.cariData();
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    Operasi.tambahData();
                    Operasi.tampilkanData();
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    Operasi.updateData();
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    Operasi.deleteData();
                    break;
                default:
                    System.err.println("Pilihan anda tidak ditemukan \nSilahkan pilih menu 1-5");
            }

            isLanjutkan = CRUD.Utility.getYesorNo("Apakah anda ingin melanjutkan? ");
        }

    }
}
