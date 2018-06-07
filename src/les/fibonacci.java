package les;

public class fibonacci {

    public static void main(String[] args) {


        int getal1 = 0;
        int getal2 = 1;
        int som = getal1 + getal2;
        int totLoop = 20;
        for( int teller = 1; teller < totLoop; teller++){
            getal2 = getal1;
            getal1 = som;
            som = getal1 + getal2;
            System.out.println(som);
        }
    }
}
