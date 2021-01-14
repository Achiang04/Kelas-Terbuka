package com.tutorial;

// player
class Player{
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player musuh){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + musuh.name + " with damage " + attackPower);
        musuh.Defend(attackPower);
    }

    void Defend(double attackPower){
        // akan mengambil damage
        double damage;
        if (this.armor.defendPower < attackPower){
            damage = attackPower - this.armor.defendPower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets demage " + damage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : "  + this.health);
        this.weapon.display();
        this.armor.display();
    }
}

// senjata
class Weapon{
    String name;
    double attackPower;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , Attack : " + this.attackPower);
    }
}

// armor
class Armor{
    double defendPower;
    String name;

    Armor(String name, double defendPower){
        this.name = name;
        this.defendPower = defendPower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , Defend : " + this.defendPower);
    }
}

public class Main{
    public static void main(String[] args) {
        
        // membuat object player
        Player player1 = new Player("ucup",100);
        Player player2 = new Player("otong",50);

        // membuat object weapon
        Weapon pedang = new Weapon("pedang", 20);
        Weapon ketapel = new Weapon("ketapel", 1);

        // membaut obejct armor 
        Armor vest = new Armor("vest", 15);
        Armor kutang = new Armor ("kutang", 0);

        // equip senjata dan armor player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(vest);
        player1.display();

        // equip senjata dan armor player 2
        player2.equipWeapon(ketapel);
        player2.equipArmor(kutang);
        player2.display();

        System.out.println("\nPerang");
        System.out.println("\nEplsode - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nEplsode - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();


        System.out.print("\n");
    }
}