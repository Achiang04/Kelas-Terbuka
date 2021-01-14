package com.tutorial;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    // getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    // getter
    public double getJari2(){
        return this.diameter/2;
    }

    public double getLuas(){
        return 3.14*getJari2()*getJari2();
    }
}

public class Main{
    public static void main(String[] args) {
        
        Data object = new Data();
        // read and wirte dengan menggunakan public
        object.intPublic = 5; // write
        System.out.println("public : " + object.intPublic); // read

        // read only (kita hanya bisa baca dengan GETTER)
        int angka = object.getIntPrivate();
        System.out.println("getter : " + angka);

        // write only (kita hanya bisa menulis dengan SETTER)
        object.setDoublePrivate(6.5);
        object.display();

        // gabungkan read and write dengan setter dan getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("jari-jari : " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("jari-jari : " + object2.getJari2());
        System.out.println("Luas : " + object2.getLuas());

        System.out.print("\n");
    }
}