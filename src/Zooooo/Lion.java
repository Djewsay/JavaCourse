package Zooooo;

public class Lion extends CatLike {

    private int power;


    public Lion(String name, int lives, int power) {
        super(name,lives);
        this.power = power;
    }



    public void rule(){

        if(this.power > 5){

            System.out.println("lion has amazeballz ruling legitimacy");

        }else {

            System.out.println("lion has 50% chance to be overruled when attacked");

        }

        System.out.println();

    }

    @Override
    public void sound() {

        System.out.println(this.name +" lets out a great RROOOOAAARRRR");
        System.out.println();
    }



}
