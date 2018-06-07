package les;

import java.util.Scanner;
public class IsPrime {


    public static void main(String[] args) {


        double number;
        boolean prime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println();
        number = sc.nextInt();
        double endLoop = Math.floor(number / 2);
        for (double teller = 2; teller <= endLoop; teller++) {
            double result = number / teller;
            if (result == Math.floor(result)) {
                prime = false;
                endLoop = teller;
            }
            else prime = true;
        }
        if (prime == false) {
            System.out.println("the entered number is not a prime number");
        }
        else{
            System.out.println("the entered number is a prime number");

        }



    }
}