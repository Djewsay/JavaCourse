package les;

import java.util.Scanner;

public class fac {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("voer een getal in ");
        System.out.println();

        long number = scanner.nextLong();
        long fac = number;

        for(int teller = 1; teller < number;teller++){
            fac = fac * (number -teller);
        }
        System.out.println(fac);
    }
}
