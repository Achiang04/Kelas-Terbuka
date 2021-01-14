package com;

// membuat class sebagai template
class Mahasiswa {
    String nama;
    int umur;
    String jurusan;
    int NIM;
    double IPK;
}

public class Main {
    public static void main(String[] args) {

        // instansiasi atau membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "bambang";
        mahasiswa1.umur = 18;
        mahasiswa1.jurusan = "teknik informatika";
        mahasiswa1.NIM = 1305982;
        mahasiswa1.IPK = 4.0;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.umur);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.IPK);

        System.out.print("\n");

        mahasiswa1.nama = "ucup";
        mahasiswa1.umur = 19;
        mahasiswa1.jurusan = "sistem informasi";
        mahasiswa1.NIM = 12485955;
        mahasiswa1.IPK = 3.5;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.umur);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.IPK);

    }
}