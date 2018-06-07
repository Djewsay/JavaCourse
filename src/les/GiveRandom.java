package les;

import java.util.Scanner;

public class GiveRandom {




    public static int berekenRandomGetal (int min, int max){ // public static int--> it is het type dat terugkeert, void = no return)

        int randomNumber;
        randomNumber = (int) (min +(max -min+1) * Math.random());


        return randomNumber; // bij fucnties ALTIJD zelf een return opgeven ( uitkomst)
    }





    public static boolean isPrimeNumber (int getal){

        boolean prime = true;

        double endLoop = Math.floor(getal / 2);
        for (double teller = 2; teller <= endLoop; teller++) {
            double result = getal / teller;
            if (result == Math.floor(result)) {
                prime = false;
                endLoop = teller;
            }
            else prime = true;
        }


     return prime;

    }





    public static void main(String[] args) {


       for (int i = 0; i >=100; i++){

           int r = GiveRandom.berekenRandomGetal(5,10);



        }



    }







}
