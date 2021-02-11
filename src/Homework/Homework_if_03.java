package Homework;

import java.util.Scanner;
public class Homework_if_03 {
    static double Distance , Dis;
    static double Timeperiod ;
    static double money , money2 , money3;

    public static void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Distance :");
        Distance = scan.nextDouble();
        
        System.out.print("Enter Time period :");
        Timeperiod = scan.nextDouble();
        Calc(Distance , Timeperiod);
    }
    
    public static void Calc(double Distance , double Timeperiod ){
        
        if(Distance <= 1){
            Dis = 35;
        }
        else if( Distance <= 12){
            Dis = 5;
        }
        else if(Distance <= 20){
            Dis = 5.50;
        }
        else if(Distance <= 40){
            Dis = 6;
        }
        else if(Distance <= 60){
            Dis = 6.50;
        }
        else if(Distance <= 80){
            Dis = 7.50;
        }
        else {
            Dis = 8.50;
        }

        money = Timeperiod * 2;
        money2 = Distance * Dis;
        money3 = money + money2;


    }

    public static void main(String[] args) {
        Homework_if_03 all = new Homework_if_03();
        System.out.println("***** Taxi service charge program *****");
        System.out.println("Distance service charge");
        System.out.println("-------------------------------");
        System.out.println("| Kilometer || Service charge |");
        System.out.println("-------------------------------");
        System.out.println("|   0 - 1   || 35  bath       |");
        System.out.println("|   2 - 12  ||  5  bath / km  |");
        System.out.println("|  13 - 20  ||5.50 bath / km  |");
        System.out.println("|  21 - 40  ||  6  bath / km  |");
        System.out.println("|  41 - 60  ||6.50 bath / km  |");
        System.out.println("|  61 - 80  ||7.50 bath / km  |");
        System.out.println("|   81 up   ||8.50 bath / km  |");
        System.out.println("-------------------------------");
        System.out.print("Time period service charge");
        System.out.println("The fare is 2 baht per hour.");
        all.input();
        System.out.println("***************************************");
        System.out.println("Distance : " + Distance + " bath");
        System.out.println("Time period : " + Timeperiod + " bath");
        System.out.println("Service charge = Distance(bath) + Timeperiod(bath)");
        System.out.println("Service charge : " + money3);



    }
}
