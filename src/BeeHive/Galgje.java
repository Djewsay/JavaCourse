package BeeHive;

import java.util.Scanner;

public class Galgje {



    public static void galgje (){



        Scanner sc = new Scanner(System.in);
        String opgave = sc.nextLine();

        String [] BbKingName = new String[opgave.length()];
        String[] BbKingGuess = new String[opgave.length()];


        for(int i = 0; i < opgave.length();i++){

            BbKingGuess[i] = "_";
            BbKingName[i] = opgave.substring(i,i+1);


        }




        Scanner sc2 = new Scanner(System.in);

        int faults = 0;
        boolean guessed = false;

        System.out.println("simple rules: guess the name, 5 faulty guesses and you lose");


        System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
        System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
        System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();



        while (!guessed && faults < 5) {
            System.out.println("Guess either the whole name or one letter");
            System.out.println("your current amount of faulty guesses = " + faults);
            String guess = sc2.nextLine();
            System.out.println();


            if (guess.equals(opgave)) {
                guessed = true;
                System.out.println("Looks like you guessed it right... grats I guess");
            } else {
                faults++;
            }

            for (int j = 0; j < BbKingName.length; j++) {
                if (guess.equals(BbKingName[j])) {
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