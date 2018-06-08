package Zooooo;

public class ZooMain {
    public static void main(String[] args) {


        BirdLike pekkie = new BirdLike("Pekkie");



        CatLike mienneke = new CatLike("Mieneke",9);

        String[] tricks = {"jump","sit","roll"};
        WolfLike doge = new WolfLike("Doge",tricks);


        Lion simba = new Lion("simba",9,10);


        RodentLike kangoo = new RodentLike();
        kangoo.name = "Skippy";


        System.out.println();
        System.out.println();

        pekkie.sound();
        mienneke.sound();
        doge.sound();
        kangoo.sound();
        simba.sound();


        mienneke.scratch();
        simba.rule();
        doge.bite();






    }


}
