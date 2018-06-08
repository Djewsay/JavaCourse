package BeeHive;

import java.util.Scanner;

public class Galgje {



    public static void galgje (){



        String[] BbKingName = {"m", "i", "t", "c", "h"};
        String[] BbKingGuess = {"_", "_", "_", "_", "_"};
        Scanner sc = new Scanner(System.in);
        String name = "mitch";
        int faults = 0;
        boolean guessed = false;

        System.out.println("simple rules: guess the name, 5 faulty guesses and you lose");


        while (!guessed && faults < 5) {
            System.out.println("Guess either the whole name or one letter");
            System.out.println("your current amount of faulty guesses = " + faults);
            String guess = sc.nextLine();
            System.out.println();

            if (guess.equals(name)) {
                guessed = true;
                System.out.println("Looks like you guessed it right... grats I guess");
            } else {
                faults++;
            }

            for (int j = 0; j < 5; j++) {
                if (guess.equals(BbKingName[j])) {
                    faults--;
                    System.out.println("succes!! " + guess + " is letter number " + (j + 1));
                    System.out.println();
                    BbKingGuess[j] = guess;
                    System.out.println("your current answer looks like this: ");

                    for (int k = 0; k < BbKingGuess.length; k++) {

                        System.out.print(" " + BbKingGuess[k]);
                    }

                    System.out.println();

                }
            }

            if (faults == 5) {
                System.out.println("GAME OVER SCRUB");
            }
        }





    }

}