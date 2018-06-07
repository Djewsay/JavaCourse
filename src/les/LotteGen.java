package les;

import java.util.Arrays;
import java.util.Random;

public class LotteGen {

    public static void main(String[] args) {


        int[] chosenNumbers = new int[6];

        Random rnd = new Random();

        for (int i = 0; i < 6; i++) {
            int random = rnd.nextInt(45);
            chosenNumbers[i] = random;

            for (int j = 0; j < 6; j++) {
                if (random == chosenNumbers[j]){
                    random =rnd.nextInt(45);


                }

            }

        }
        Arrays.sort(chosenNumbers);
        PrintChosen(chosenNumbers);


    }

    private static void PrintChosen(int[] chosenNumbers) {
        for (int k = 0;k<6;k++){
            System.out.println(chosenNumbers[k]);
        }
    }
}
