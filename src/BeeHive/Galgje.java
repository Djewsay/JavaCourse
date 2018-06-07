package BeeHive;

import java.util.Scanner;

public class Galgje {

    public static void main(String[] args) {

        String[] BbKingName = {"m", "i", "t", "c", "h"};
        String[] BbKingGuess = {"_", "_", "_", "_", "_"};
        Scanner sc = new Scanner(System.in);
        String name = "mitch";
        int fouten = 0;
        boolean guessed = false;
        while (!guessed && fouten<5){
            System.out.println("Guess the name or one letter mongrels");
            String guess = sc.nextLine();
            System.out.println();
            if(guess .equals(name)){
                guessed = true;
                System.out.println("Looks like you guessed it right... damnit");
            }else {
                fouten++;
            }
            for (int j = 0; j < 5; j++) {
                if (guess.equals(BbKingName[j])) {
                    System.out.println("succes!! " + guess + " is letter number " + (j + 1));
                    System.out.println();
                    BbKingGuess[j] = guess;
                    System.out.println("your current answer looks like this: ");
                    System.out.print(" " + BbKingGuess[0]);
                    System.out.print(" " + BbKingGuess[1]);
                    System.out.print(" " + BbKingGuess[2]);
                    System.out.print(" " + BbKingGuess[3]);
                    System.out.println(" " + BbKingGuess[4]);
                    System.out.println();
                    fouten--;
                }
            }
            if(fouten==5){
                System.out.println("GAME OVER PLEBS");
            }
        }
    }
}