package les;

public class Bank {

    public static void main(String[] args) {



        String maand = "jan";

    switch(maand) {

        case "sep":
            System.out.println("te klein");
            break;
        case "okt":
        case "nov":
        case "dec":
            System.out.println("super lekker");
            break;
        case "jan":
            System.out.println("einde seizoen");
        case "feb":
        case "mrt":
        case "apr":
            break;
        default:
            System.out.println("AFBLUVEN");
            break;


    }


    }
}
