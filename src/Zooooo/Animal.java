package Zooooo;

public abstract class Animal {

    protected String name;


    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound();
    public abstract void eat();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
