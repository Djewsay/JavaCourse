package BeeHive;

import java.util.Random;

public class Soldier {

    int hitpoints;
    int armor;
    int strength;
    String name = "";



    public Soldier (int inHitpoints, int inArmor, int inStrength, String inName){

        hitpoints = inHitpoints;
        armor = inArmor;
        strength = inStrength;
        name = inName;

    }



    public void attack(Soldier enemy){

        do {
            System.out.println(this.name + " slaat op "+ enemy.name+ " zijn bakkes en doet " + damageDone() + " damage" + this.hitpoints+" "+ enemy.hitpoints);
            enemy.hitpoints -= damageDone();
            this.hitpoints -= damageDone();



        } while(enemy.hitpoints>0);

        enemy.isDead();

    }


    public void isDead(){

        if (hitpoints <= 0);
        System.out.println(this.name + " is kapotgemaakt");
    }


    public int damageDone (){

        Random rnd = new Random();

        int damage = rnd.nextInt(this.strength);
        if (armor>damage){
            damage = 0;
        }

        return  damage;
    }


}
