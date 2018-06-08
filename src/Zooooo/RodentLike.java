package Zooooo;

public class RodentLike extends Animal {


    protected boolean isFluffy;


    public boolean isFluffy() {
        return isFluffy;
    }


    public void fluffy(){

        System.out.println();

    }

    @Override
    public void eat() {
        System.out.println("omnomnomnomnomn");
    }


    @Override
    public void sound() {
        System.out.println("MIEP");
    }
}


