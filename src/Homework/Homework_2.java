package Homework;

import java.util.Scanner;
public class Homework_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float principal,Interate1,Interate2,Interate3,Interate4,Interate5, money1 ,  money2 ,  money3 ,  money4 ,  money5 , money6;

        System.out.println("******** Deposit Calculation ********");
        System.out.print("Enter principal : ");
        principal = scan.nextFloat();

        System.out.print("Enter Interate Year 1 : ");
        Interate1 = scan.nextFloat();
        System.out.print("Enter Interate Year 2 : ");
        Interate2 = scan.nextFloat();
        System.out.print("Enter Interate Year 3 : ");
        Interate3 = scan.nextFloat();
        System.out.print("Enter Interate Year 4 : ");
        Interate4 = scan.nextFloat();
        System.out.print("Enter Interate Year 5 : ");
        Interate5 = scan.nextFloat();
        System.out.println("******** Deposit ********");
        money1 = principal * Interate1;
        System.out.println("Deposit Year 1 : " + money1);
        money2 = principal * Interate2;
        System.out.println("Deposit Year 2 : " + money2);
        money3 = principal * Interate3;
        System.out.println("Deposit Year 3 : " + money3);
        money4 = principal * Interate4;
        System.out.println("Deposit Year 4 : " + money4);
        money5 = principal * Interate5;
        System.out.println("Deposit Year 5 : " + money5);
        money6 = money1 + money2 + money3 + money4 + money5;
        System.out.println("Total Deposit 5 Year = " + money6);
        }
    
}
