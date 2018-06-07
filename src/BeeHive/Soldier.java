package BeeHive;

import java.util.Random;

public class Soldier extends Bee{

    int hitpoints;
    int armor;
    int strength;

    public Soldier(String name, int hitpoints, int armor, int strength) {
        super(name);
        this.hitpoints = hitpoints;
        this.armor = armor;
        this.strength = strength;
    }


/* best de naam vragen niet met super.getname, maar gewoon .getname */

    public void attack(Soldier enemy){

        do {
            System.out.println(super.getName() + " slaat op "+ super.getName()+ " zijn bakkes en doet " + damageDone() + " damage" + this.hitpoints+" "+ enemy.hitpoints);
            enemy.hitpoints -= damageDone();
            this.hitpoints -= damageDone();



        } while(enemy.hitpoints>0);

        enemy.isDead();

    }


    public void isDead(){

        if (hitpoints <= 0);
        System.out.println(super.getName() + " is kapotgemaakt");
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
