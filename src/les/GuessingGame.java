package les;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {


        int getal = GiveRandom.berekenRandomGetal(1,10);
        int guess;
        System.out.println(getal);


        for(int teller = 1; teller <4 ; teller ++){

            System.out.println("voer uw gok in");
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();

                if (guess == getal){

                    System.out.println("proficiat, u hebt het geraden");
                    teller = 4;

                    }

                if (teller ==3){
                    System.out.println("GAME OVER PLEB");
                }




        }


    }
}
