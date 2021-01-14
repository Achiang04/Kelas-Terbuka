package com.tutorial;

// this.name akan mengakses atribut name kalau ada dikelas ini
// jika tidak ada maka akan mengkases atribut name dari superclass
// super.name akan selalu mengakses atribut superclass

public class HeroStrength extends Hero{
    String name = "Class Strength";

    void display(){
        System.out.println("Ini adalah " + this.name);
        this.dummyMethod();
    }

    void displaySuper(){
        System.out.println("Ini adalah " + super.name);
        this.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("Method ini ada di subclass");
    }
}