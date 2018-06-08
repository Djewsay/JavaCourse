package Zooooo;

public class BirdLike extends Animal {



    public BirdLike(String name) {
        super(name);
    }

    @Override
    public void sound() {

        System.out.println(this.name+" lets out a great TJIEP TJIEP");
        System.out.println();
    }


    @Override
    public void eat() {
        System.out.println("omnomnomnomnomn");
    }
}


