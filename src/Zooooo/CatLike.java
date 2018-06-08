package Zooooo;

public class CatLike extends Animal {

    private int lives;

    public CatLike(String name, int lives) {
        super(name);
        this.lives = lives;
    }


    public void scratch(){

        System.out.println("Cat" + this.name + " Scratches and leaves target in great agony");
        System.out.println();

    }


    public int showLives(){

        return lives;
    }


    @Override
    public void eat() {
        System.out.println("omnomnomnom");
    }

    @Override
    public void sound() {


        System.out.println("what does" +this.name+ " say? MEEEOOOWWW");
        System.out.println();

    }


}
