package les;

public class PiBerekenen {
    public static void main(String[] args) {

        int limit = 10;
        int teken = 1;
        double som = 0;


        for (double teller = 1; teller <= limit; teller +=2) {

            double term = ( 1.0 / teller) * teken;
            teken = -teken;  //*= of teken = -teken
            som = som +term;

        }

        double pi = 4*som;
        System.out.println(pi);




    }
}
