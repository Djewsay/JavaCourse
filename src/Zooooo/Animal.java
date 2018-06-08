package Zooooo;

public class Animal {

    protected String name;




    public Animal(String name) {
        this.name = name;
    }

    public void sound(){

        System.out.println("MIIEEEP");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
