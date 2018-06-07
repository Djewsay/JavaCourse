package les;

import java.util.Scanner;


public class VowelCounter {
    public static void main(String[] args) {

        System.out.println("Voer een text in AUB: ");
        Scanner scText = new Scanner(System.in);
        String givenText = scText.nextLine().toLowerCase();

        char[] textArray = new char[givenText.length()];
        char[] vowelArray = {'a', 'u', 'o', 'i', 'e'};
        int[] vowelCount = new int[5];


        for (int i = 0; i < givenText.length(); i++) {
            textArray[i] = givenText.charAt(i);

            for (int j = 0; j< 5; j++){
                if (textArray[i] == vowelArray[j]) {
                    vowelCount[j]++;
                }
            }
        }
        System.out.println("het aantal keer A bedraagt: "+vowelCount[0]);
        System.out.println("het aantal keer U bedraagt: "+vowelCount[1]);
        System.out.println("het aantal keer O bedraagt: "+vowelCount[2]);
        System.out.println("het aantal keer I bedraagt: "+vowelCount[3]);
        System.out.println("het aantal keer E bedraagt: "+vowelCount[4]);

    }

}

/* public static char [] converteerNaarArray(String_in){

        char[] textArray = new char [givenTesxt.length]


        for ( int i = 0; i < giventext.lenght; i++) {

        textarray[i] = givenText.charAt[i];

        }
        }



        retrun textArray

 */
