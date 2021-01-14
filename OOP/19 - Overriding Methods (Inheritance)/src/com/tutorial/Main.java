package com.tutorial;

class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Asep";
        // hero1.defendPower = gak punya;
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Bambang";
        hero2.defendPower = 100;
        hero2.display();

        System.out.print("\n");
    }
}