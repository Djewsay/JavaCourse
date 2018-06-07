package BeeHive;

public class Worker extends Bee{

  int capacity;
  int load;


    public Worker(String name, int capacity, int load) {
        super(name);
        this.capacity = capacity;
        this.load = load;
    }









    public void    gatherNectar(){


      for (int i = 0; i<10; i++){

          load += 5;
      }
  }


}
