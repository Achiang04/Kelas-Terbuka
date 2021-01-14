package com.tutorial;

// class tanpa constructor / class polos
class Polos{
    String dataString;
    int dataInteger;
}

// class Polos{
//     String dataString = "polos";
//     int dataInteger = 0;
// }

// class dengan constructor
class Mahasiswa{
    String nama;
    int NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, int inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        
        // class tanpa constructor

        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);

        // class dengan constructor
        // Mahasiswa mahasiswa1 = new Mahasiswa();

        // new Mahasiswa();

        // constructor dengan parameter
        Mahasiswa mahasiswa1 = new Mahasiswa("bambang", 1564437, "teknik informatika\n");
        Mahasiswa mahasiswa2 = new Mahasiswa("otong", 1235637, "sistem informasi");
        
        // System.out.println(mahasiswa1.nama);
        // System.out.println(mahasiswa2.nama);
    }
}