package Homework;
import java.util.Scanner;
public class Homework_if_06 {
    static int month;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** Show the month that matches the entered number. *****");
        System.out.print("Enter number :");
        month = scan.nextInt();
        if(month == 28 || month == 29) {
            System.out.println("February have 28 days or Leap year 29 days");
        }
        else if(month == 31){
            System.out.println("January have 31 days");
            System.out.println("March have 31 days");
            System.out.println("May have 31 days");
            System.out.println("July have 31 days");
            System.out.println("August have 31 days");
            System.out.println("October have 31 days");
            System.out.println("December have 31 days");
        }
        else if(month == 30){
            System.out.println("April have 30 days");
            System.out.println("June have 30 days");
            System.out.println("September have 30 days");
            System.out.println("November have 30 days");
        }
        else{
            System.out.println("Cannot be displayed. The data is not correct.");
        }
    }
}
