package Lab4.Lab4_5;

import java.util.Scanner;
public class fooddiscount {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int customer;
        int money;
        double money1;
        double money2;
        double money3;
        
        double discount = 0;
        double vat = 0;

        System.out.println( "****** Food discount promotion ******" );
        System.out.print("Enter number of customers : ");
        customer = scan.nextInt();
        System.out.print("Enter all food expenses : ");
        money = scan.nextInt();

        

        if(customer <= 2){
            System.out.println( "****** Food expenses  ******" );
            System.out.println("Number of customers : " + customer);
            System.out.println("All food expenses : " + money + " bath ");
            System.out.println("!NO Discount!");
            vat = money * 0.07;
            System.out.print("Tex 7% : " + vat + " bath ");
            money1 = vat + money;
            System.out.print("Food prices include tex : " + money1 + " bath ");

        }
        else if(customer <= 3 && customer >= 5){
            System.out.println( "****** Food expenses  ******" );
            System.out.println("Number of customers : " + customer);
            System.out.println("All food expenses : " + money + " bath ");
            money2 = money * 0.05;
            System.out.println("Food discount 5% : " + money2 + " bath ");
            money3 = money - money2;
            System.out.println("Discounted food prices : " + money3 + " bath ");
            vat = money3 * 0.07;
            System.out.println("Tex 7% : " + vat + " bath ");
            money1 = vat + money3;
            System.out.println("Food prices include tex : " + money1 + " bath ");

        }
        else if (customer <= 6 && customer >= 10){
            System.out.println( "****** Food expenses  ******" );
            System.out.println("Number of customers : " + customer);
            System.out.println("All food expenses : " + money + " bath ");
            money2 = money * 0.12;
            System.out.println("Food discount 5% : " + money2 + " bath ");
            money3 = money - money2;
            System.out.println("Discounted food prices : " + money3 + " bath ");
            vat = money3 * 0.07;
            System.out.println("Tex 7% : " + vat + " bath ");
            money1 = vat + money3;
            System.out.println("Food prices include tex : " + money1 + " bath ");
        }
        else if(customer <= 11 && customer >= 14){
            System.out.println( "****** Food expenses  ******" );
            System.out.println("Number of customers : " + customer);
            System.out.println("All food expenses : " + money + " bath ");
            money2 = money * 0.13;
            System.out.println("Food discount 5% : " + money2 + " bath ");
            money3 = money - money2;
            System.out.println("Discounted food prices : " + money3 + " bath ");
            vat = money3 * 0.07;
            System.out.println("Tex 7% : " + vat + " bath ");
            money1 = vat + money3;
            System.out.println("Food prices include tex : " + money1 + " bath ");
        }
        else if(customer <= 15 && customer >= 17){
            System.out.println( "****** Food expenses  ******" );
            System.out.println("Number of customers : " + customer);
            System.out.println("All food expenses : " + money + " bath ");
            money2 = money * 0.2;
            System.out.println("Food discount 5% : " + money2 + " bath ");
            money3 = money - money2;
            System.out.println("Discounted food prices : " + money3 + " bath ");
            vat = money3 * 0.07;
            System.out.println("Tex 7% : " + vat + " bath ");
            money1 = vat + money3;
            System.out.println("Food prices include tex : " + money1 + "bath");
        }
        else if(customer <= 18 && customer >= 20){
            System.out.println( "****** Food expenses  ******" );
            System.out.println("Number of customers : " + customer);
            System.out.println("All food expenses : " + money + " bath ");
            money2 = money * 0.3;
            System.out.println("Food discount 5% : " + money2 + " bath ");
            money3 = money - money2;
            System.out.println("Discounted food prices : " + money3 + " bath ");
            vat = money3* 0.07;
            System.out.println("Tex 7% : " + vat + " bath ");
            money1 = vat + money3;
            System.out.println("Food prices include tex : " + money1 + " bath ");
        }
        else if(customer <= 21 && customer >= 22){
            System.out.println( "****** Food expenses  ******" );
            System.out.println("Number of customers : " + customer);
            System.out.println("All food expenses : " + money + " bath ");
            money2 = money * 0.35;
            System.out.println("Food discount 5% : " + money2 + " bath ");
            money3 = money - money2;
            System.out.println("Discounted food prices : " + money3 + " bath ");
            vat = money3 * 0.07;
            System.out.println("Tex 7% : " + vat + " bath ");
            money1 = vat +money3;
            System.out.println("Food prices include tex : " + money1 + " bath ");
        }
        else {
            System.out.println( "****** Food expenses  ******" );
            System.out.println("Number of customers : " + customer );
            System.out.println("All food expenses : " + money + " bath ");
            money2 = money * 0.4;
            System.out.println("Food discount 5% : " + money2 + " bath ");
            money3 = money - money2;
            System.out.println("Discounted food prices : " + money3 + " bath ");
            vat = money3 * 0.07;
            System.out.println("Tex 7% : " + vat + " bath ");
            money1 = vat + money3;
            System.out.println("Food prices include tex : " + money1 + " bath ");
        }


    }
    
}
