package com.tutorial;

// class Mahasiswa{
//     // Data member
//     String nama = "nama asli";
//     int NIM;

//     // constructor
//     Mahasiswa(String nama, int inputNIM){
//         System.out.println(nama); 
//         System.out.println(this.nama);
//     }


//     // Data member
//     String nama;
//     int NIM;

//     // constructor
//     Mahasiswa(String InputNama, int inputNIM){      
//         nama = inputNama;
//         NIM = inputNIM;
//         Main.test(); // cara mengakses method di dalam class Main
//     }
// }

class Mahasiswa{
    // Data member
    String nama = "nama asli";
    int NIM;

    // constructor
    Mahasiswa(String nama, int NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }
    int getNIM(){
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

// class Dosen{
//     String nama;

//     Dosen(String nama){
//         this.nama = nama;
//     }
// }

public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("bambang",189617);
        // method
        mahasiswa1.show();
        mahasiswa1.setNama("otong");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);

        // Dosen dosen1 = new Dosen("otong");
        // dosen1.---(show, setNama, getNama, getNIM, sayHi) => tidak bisa
        // karena class dosen tidak akan bisa mengakses ke class mahasiswa


        // System.out.println(mahasiswa1.nama);
        // test();
    }
    // static void test(){
    //     System.out.println("ini adalah method test");
    // }
}