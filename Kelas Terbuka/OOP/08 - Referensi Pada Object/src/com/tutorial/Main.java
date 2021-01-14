package com.tutorial;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("Judul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("\nbuku1");
        Buku buku1 = new Buku("Killing Commandantore", "Haruki Murakami");
        buku1.display();
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        // assignment object
        System.out.println("\nbuku2");
        Buku buku2 = new Buku("Killing Commandantore", "Haruki Murakami");
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        // assignment object
        System.out.println("\nbuku3");
        Buku buku3 = buku1;
        buku3.display();
        String addressBuku3 = Integer.toHexString(System.identityHashCode(buku3));
        System.out.println(addressBuku3);

        // karena buku1 dan buku3 berada pada address atau referensi yang sama
        buku1.judul = "Membunuh Komandantore";
        System.out.println("\nbuku1");
        buku1.display();
        System.out.println("\nbuku2");
        buku2.display();
        System.out.println("\nbuku3");
        buku3.display();
        
        // kita akan memasukkan object kedalam methods
        fungsi(buku3);
        System.out.println("\nbuku1");
        buku1.display();
        System.out.println("\nbuku3");
        buku3.display();

        System.out.print("\n");
    }

    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi : " + addressDataBuku);
        dataBuku.penulis = "Haruki Mahalkami";
    }
}