package les;

import java.util.Scanner;

public class HowOldNoz {



    public static void main(String[] args) {

        int Leeftijd;
        int huidigJaartal = 2018;
        System.out.println("wat is jouw geboortejaar?");
        Scanner userinput = new Scanner(System.in);

// next = volgende spatie , nextline = volgende enter

       int geboorteJaar = userinput.nextInt();
       int leeftijd = huidigJaartal - geboorteJaar;

        System.out.println("uw leeftijd is " + leeftijd);

    }


}


//