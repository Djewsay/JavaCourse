package les;

public class FizzBuzz {
    public static void main(String[] args) {

for(int teller = 1; teller < 100; teller++){

if (teller % 3 != 0 && teller %5 != 0){

    System.out.println(teller);
}


   if (teller % 3 == 0){

        System.out.print("fizz" );
       System.out.println();

    }



    if (teller % 5 ==0){

        System.out.print("buzz" );

    }




}

    }
}
