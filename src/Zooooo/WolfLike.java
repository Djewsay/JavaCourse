package Zooooo;

public class WolfLike extends Animal {


    protected String[] tricks;


    public WolfLike(String name, String[] tricks) {
        super(name);
        this.tricks = tricks;
    }


    @Override
    public void sound() {

        System.out.println(this.name +" goes SSSKKRRRRRRP 2+2=4 quick mafs");
        System.out.println();

    }


    public void bite() {

        System.out.println(this.name + " bites the target wounding it greatly");
        System.out.println();

    }

    @Override
    public void eat() {
        System.out.println("omnomnomnom");
    }
}
