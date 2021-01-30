import java.util.Scanner;
public class Homework_if_05 {
    static String name , lname;
    static double money , money2 , bonus , bonus2 ,moneyall;

    public Homework_if_05(){
        money = 0;
        bonus = 0;
    }

    public static void input(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your name : ");
        name = scan.nextLine();
        System.out.print("Enter Your surname : ");
        lname = scan.nextLine();
        System.out.print("Enter Your salary : ");
        money = scan.nextDouble();

        System.out.println("********* Annual salary slip including bonus *********");
        System.out.println("Your name : " + name);
        System.out.println("Your surname : " + lname);
        System.out.println("Your salary : " + money);

        Calc(name , lname , money);
     
    }

    public static void Calc(String name , String lname , double money){

        money2 = money * 12;

            if(money2 <= 15000){

                System.out.println("NO Bonus!");
                
            }
             else if(money2 >= 15001 && money2 <= 20000 ){
                System.out.println("Receive a bonus of 7% of salary.");
                bonus = 0.07;
                
             }
             else if(money2 >= 20001 && money2 <= 30000){
                System.out.println("Receive a bonus of 10% of salary.");
                bonus = 0.1;
             }
             else if(money2 >= 30001 && money2 <= 40000){
                System.out.println("Receive a bonus of 12% of salary.");
                bonus = 0.12;
             }
             else if(money2 >= 40001 && money2 <= 60000){
                System.out.println("Receive a bonus of 13% of salary.");
                bonus = 0.13;
             }
             else if(money2 >= 60001 && money2 <= 70000){
                System.out.println("Receive a bonus of 14% of salary.");
                bonus = 0.14;
             }
             else{
                System.out.println("Receive a bonus of 15% of salary.");
                bonus = 0.15;
             }

             bonus2 = money2 * bonus;
             System.out.println("Your Bonus :"+ bonus2);
             moneyall = money2 + bonus2;
             System.out.println("Your Salary including bonus :"+ moneyall);
       
    }

    public static void main(String[] args) {

        Homework_if_05 all = new Homework_if_05();
        System.out.println("Program Salary including bonus.");
        all.input();
        
       
        
        
    }

}
