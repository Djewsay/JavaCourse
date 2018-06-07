package les;

import java.util.Scanner;

public class TaxBerekening {

    public static void main(String[] args) {



                int num1;
                double soSecPercent = 13.07;
                double maatStaf;
                double nettoLoon;
                double soSec;
                double belastingen;
                double schaal1 = 8680;
                double schaal2 = 12360;
                double schaal3 = 20600;
                double schaal4 = 37750;
                double belSchaal1 = 2170;
                double belSchaal2 = 1104;
                double belSchaal3 = 3269;
                double belSchaal4 = 7717.50;
                double belHoger4 = 14287.5;


                Scanner sc = new Scanner(System.in);
                System.out.print("enter income:");
                num1 = sc.nextInt();

                soSec = (num1/100)* soSecPercent;
                System.out.println("het bedrag voor de sociale zekerheid bedraagt: " + soSec);
                maatStaf = num1 - (num1/100) * soSecPercent;
                System.out.println("de maatstaf van heffing is: " + maatStaf);


                if(maatStaf > schaal4){
                    belastingen = belHoger4 + (((num1-37750)/100)*50);
                    nettoLoon = num1-belastingen;
                    System.out.println("uw totaal belastingen bedraagt: " + belastingen);
                    System.out.println("uw nettoloon bedraagt: " + nettoLoon);
                }
                else if(maatStaf > schaal3){
                    belastingen = belSchaal4 + (((num1 - schaal3)/100)*45);
                    nettoLoon = num1-belastingen;
                    System.out.println("uw totaal belastingen bedraagt: " + belastingen);
                    System.out.println("uw nettoloon bedraagt: " + nettoLoon);
                }
                else if(maatStaf > schaal2) {
                    belastingen = belSchaal3 + (((num1 - schaal2) / 100) * 40);
                    nettoLoon = num1 - belastingen;
                    System.out.println("uw totaal belastingen bedraagt: " + belastingen);
                    System.out.println("uw nettoloon bedraagt: " + nettoLoon);
                }
                else if(maatStaf > schaal1) {
                    belastingen = belSchaal2 + (((num1 - schaal1) / 100) * 30);
                    nettoLoon = num1 - belastingen;
                    System.out.println("uw totaal belastingen bedraagt: " + belastingen);
                    System.out.println("uw nettoloon bedraagt: " + nettoLoon);
                }
                else if(maatStaf > schaal1) {
                    belastingen = num1 + ((num1 / 100) * 25);
                    nettoLoon = num1 - belastingen;
                    System.out.println("uw totaal belastingen bedraagt: " + belastingen);
                    System.out.println("uw nettoloon bedraagt: " + nettoLoon);
                }
            }
        }